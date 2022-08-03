package Stringprobs;

public class asmsWhere {

	public static String asmswhere(String input) {
		String output = "(";
		String[] tokens = input.split("\\s+");
		for(String token : tokens) {
			
			if (token.contains("_") && !token.contains("logger")) {
				char[] tokenArray = token.toCharArray();
				String newToken = "";
				for (int i = 0; i < tokenArray.length; i++) {
					if (tokenArray[i] == '_') {
						newToken += Character.toUpperCase(tokenArray[i + 1]);
						i++;
					} else {
						newToken += tokenArray[i];
					}
				}
				token = newToken;

			}
			if (token.contains("[0]")) {
				token = token.replace("[0]", "");
			}
			if (token.contains("[i]")) {
				token = token.replace("[i]", ".get(i)");
			}
			if (token.contains("[j]")) {
				token = token.replace("[j]", ".get(j)");
			}
			if (token.contains("[k]")) {
				token = token.replace("[k]", ".get(k)");
			}
			
			if(!token.contains("\"") && token.contains(".append")) {
				if(token.contains("(") && token.contains(")") && token.contains(";")) {
					int startIndex = token.indexOf('(');
					int endIndex = token.lastIndexOf(')');
					output = output + token.substring(startIndex+1, endIndex) + ',';
				} 					
			}
		}
		output = output.substring(0, output.length() - 1);
		return output + ')';
	}
	public static void main(String[] args) {

		String input = "							sqlBuf.append(serviceId);\r\n"
				+ "							sqlBuf.append(\"'\");\r\n"
				+ "							sqlBuf.append(\" and COMPONENT_ID = '\");\r\n"
				+ "							sqlBuf.append(attrs3[i].getComponent_id());\r\n"
				+ "							sqlBuf.append(\"'\");\r\n"
				+ "							sqlBuf.append(\" and FEATURE_ID = '\");\r\n"
				+ "							sqlBuf.append(attrs3[i].getFeature_id());\r\n"
				+ "							sqlBuf.append(\"'\");\r\n"
				+ "							sqlBuf.append(\" and ATTR_ID = '\");\r\n"
				+ "							sqlBuf.append(attrs3[i].getAttr_id());";
		
		System.out.println(asmsWhere.asmswhere(input));
	}

}

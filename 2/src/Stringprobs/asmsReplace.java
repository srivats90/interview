package Stringprobs;

public class asmsReplace {

	public static String replacestrs(String input) {

		String[] tokens = input.split("\\s+");
		String output = "";
		for (String token : tokens) {
			// System.out.println(token + " " + token.length());
			if (token.length() > 1 && (Character.isUpperCase(token.charAt(0)))) {
				// System.out.println(token);
				if (token.contains("[]")) {
					token = "List<" + token;
					token = token.substring(0, token.length() - 2) + ">";
					// token = token + ">";
					// System.out.println(token);
				}
			} else if (token.length() > 1) {
				// System.out.println(token);
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
				if (token.contains("[p]")) {
					token = token.replace("[p]", ".get(p)");
				}
				if (token.contains("[j]")) {
					token = token.replace("[j]", ".get(j)");
				}
				if (token.contains("[k]")) {
					token = token.replace("[k]", ".get(k)");
				}
				if (token.contains(".length")) {
					token = token.replace(".length", ".size()");
				}
//				if(token.contains("new Integer")) {
//					token = token.replace("new Integer", "");
//				}
				// System.out.println(token);
			}

			output += token + " ";
		}

		return output;
	}

	public static void main(String[] args) {

		String input = "							if (roles[0].getAll_service_flag() != null) {\r\n"
				+ "								if (roles[0].getAll_service_flag().equals(INDICATOR_ON)) {\r\n"
				+ "									all_services_flg = true;\r\n"
				+ "\r\n"
				+ "								}\r\n"
				+ "							}";
		
//		String input = "						Ain_attr[] requiredColumns = null;\r\n"
//				+ "						Ain_attr attr3 = new Ain_attr();";
//		
		String out = asmsReplace.replacestrs(input);
		System.out.println(out);
	}

}

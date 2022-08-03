package Stringprobs;

public class asmsfunction {

	public static String replacestrs(String input) {

		String whereClauseOutput = "(";
		boolean whereClauseFlag = false;
		String output = "";
		String[] lines = input.split("\n");
		String listClass = null;

		for (String line : lines) {
			// System.out.println(line);
			if (line.contains("append") || line.contains("StringBuffer"))
				line = "//" + line;
			if (line.contains("db."))
				line = "//TODO" + line;
			if (line.contains("new Integer"))
				line.replace("new Integer", "");
			String[] tokens = line.split("\\s+");
			for (String token : tokens) {
				// System.out.println(token + " " + token.length());
				if (token.length() > 1 && (Character.isUpperCase(token.charAt(0)))) {
					// System.out.println(token);
					if (token.contains("[]")) {
						listClass = token.substring(0, token.length() - 2);
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
							if (tokenArray[i] == '_' && !Character.isUpperCase(tokenArray[i + 1])) {
								newToken += Character.toUpperCase(tokenArray[i + 1]);
								i++;
							} else {
								newToken += tokenArray[i];
							}
						}
						token = newToken;

					}
					if (token.contains("[0]")) {
						token = token.replace("[0]", ".get(0)");
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
					if (token.contains("[ii]")) {
						token = token.replace("[ii]", ".get(ii)");
					}
					if (token.contains("[jj]")) {
						token = token.replace("[jj]", ".get(jj)");
					}
					if (token.contains("[l]")) {
						token = token.replace("[l]", ".get(l)");
					}
					if (token.contains(".length")) {
						token = token.replace(".length", ".size()");
					}
					if (!token.contains("\"") && token.contains(".append")) {
						if (token.contains("(") && token.contains(")") && token.contains(";")) {
							int startIndex = token.indexOf('(');
							int endIndex = token.lastIndexOf(')');
							whereClauseOutput = whereClauseOutput + token.substring(startIndex + 1, endIndex) + ',';
							whereClauseFlag = true;
						}
					}
				}
				output += token + " ";
			}
			output += "\n";
			if (listClass != null) {
				// do something for repo
				listClass = null;
			}
		}
		if (whereClauseFlag == true) {
			whereClauseOutput = whereClauseOutput.substring(0, whereClauseOutput.length() - 1);
			whereClauseOutput += ");";
			output += "\n" + whereClauseOutput;
			whereClauseFlag = false;
		}

		return output;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String input = "				if (parameters[i].getParam_name().equals(ASMS_PARAMETER_PAGE_SIZE)) {\r\n"
				+ "					Integer tmpInteger = new Integer(parameters[i].getParam_value());\r\n"
				+ "					page_size = tmpInteger.intValue();\r\n"
				+ "				}\r\n"
				+ "\r\n"
				+ "				if (parameters[i].getParam_name().equals(ASMS_PARAMETER_MAX_FETCH_ROWS)) {\r\n"
				+ "					Integer tmpInteger = new Integer(parameters[i].getParam_value());\r\n"
				+ "					max_fetch_size = tmpInteger.intValue();\r\n"
				+ "				}";

		String out = asmsfunction.replacestrs(input);
		System.out.println(out);
	}

}

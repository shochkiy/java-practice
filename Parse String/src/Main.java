public class Main {

    public static String printTextPerRole(String[] roles, String[] textLines) {
        String result = "";
        StringBuilder builder = new StringBuilder();
        for (String role : roles) {
            builder.append(role + ":" + "\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(role + ":")) {
                   builder.append(j + 1 + ") " + textLines[j].replaceF((role + ": "), "") + "\n");
                }
            }
            builder.append("\n");
        }

        return builder.toString();
}

    public static void main(String[] args) {
        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич", "Городничийпсина", "Лука"};
        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Городничийпсина: бла бла бал"
        };

        System.out.println(printTextPerRole(roles, textLines));

    }


}

class Encode {
    static String transform(String s) {
        if (s == null) return null;
        StringBuilder sb = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (Character.toLowerCase(c)) {
                case 'a': sb.append('1'); break;
                case 'e': sb.append('2'); break;
                case 'i': sb.append('3'); break;
                case 'o': sb.append('4'); break;
                case 'u': sb.append('5'); break;
                default: sb.append(c); break;
            }
        }
        return sb.toString();
    }
}

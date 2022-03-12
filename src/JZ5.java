/**
 * @author Jiacheng
 * @version v1.0
 * @date 2022/3/11 22:49
 */
public class JZ5 {
    public String replaceSpace(String s) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char t = sb.charAt(i);
            if (t == ' ') {
                sb.append("%20");
            } else {
                sb.append(t);
            }
        }
        return sb.toString();
    }
}

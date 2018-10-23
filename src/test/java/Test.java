import org.springframework.security.crypto.bcrypt.BCrypt;

public class Test {
	public static void main(String[] args) {
		String hashed = BCrypt.hashpw("12345", BCrypt.gensalt());
		System.out.println(hashed);
	}
}

package collections;

import java.security.MessageDigest;

public class encrypt {

	public static String encryptToken(String pwd) {
		try {

			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(pwd.getBytes("UTF-8"));
			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}

			// 출력
			return hexString.toString();

		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

	public static String makeToken(String birth, String name, String password) {
		String token = new StringBuffer(birth).append(name).append(password).toString();

		String encryptToken = encryptToken(token);

		return encryptToken;
	}

	public static void main(String[] args) {
		String birth = "19901230";
		String name = "유재석";
		String password = "dbwoTjr123";

		String UID = makeToken(birth, name, password);
		System.out.println(UID);

	}

}

package string_and_array;

public class LicenseKeyFormatting {

	public static void main(String[] args) {

		String S = "5F3Z-2e-9-wabcdef";
		int k = 4;
		System.out.println(licenseKeyFormatting(S, k));

	}

	public static String licenseKeyFormatting(String S, int K) {

		String tmp = S.replace("-", "");
		tmp = tmp.toUpperCase();

		int len = tmp.length();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < len; i++) {
			sb.append(tmp.charAt(i));
		}

		for (int i = K; i < len; i = K + i) {
			sb.insert(len - i, '-');
		}

		return sb.toString();
	}

}

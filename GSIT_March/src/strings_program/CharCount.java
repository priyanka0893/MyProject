package strings_program;

public class CharCount {

	public static void main(String[] args) {
		String str = "programming";
		char ch[] = str.toCharArray();
		boolean b[] = new boolean[str.length()];
		for(int i =0;i<ch.length;i++) {
			if(b[i])
				continue;
			int count = 1;
			for(int j = i+1;j<ch.length;j++) {
				if(ch[i] == ch[j]) {
					count++;
					b[j] = true;
				}
			}
			System.out.println(ch[i] +" = "+count);
		}
	}

}

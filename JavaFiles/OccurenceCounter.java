/**
These are VIM commands, shortcuts for EASE of use. :)

Inserting 
a: add text infront of cursor
A: add text end of line
i: add text behind cursor
I: add text beginning of line
o: open new line, add text
O: open new line in front of other line, add text

Deleting
dw: delete word
dd: delete line
d$: delete all infront of cursor in line
*/

public class OccurenceCounter {
	public static void main(String[] args){
		System.out.print(frequency("aabbccddeeeegha"));
	}

	public static String frequency(String string){
		if(string.length() == 1) return string;
		
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for (int i = 0; i < string.length() - 1; i++){
			if(string.charAt(i) == string.charAt(i+1)){
				count++;
			}
			else {
				if(count > 1){
					sb.append(string.charAt(i) + Integer.toString(count));
				}
				else {
					sb.append(string.charAt(i));
				}
			}
		}

		if(count > 1){
			sb.append(string.charAt(string.length()-1) + Integer.toString(count));
		}
		else {
			sb.append(string.charAt(string.length()-1));
		}

		return sb.toString();
	}
}

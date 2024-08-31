
public class App {
	public static void main(String[] args) {
		int[] values = {3,5,6};
		System.out.println(values[2]);
		
		int[][] grid = {
				{3,5,6},
				{2,5},
				{1,2,3,4}
		};
		
		System.out.println(grid[0][1]);
		System.out.println(grid[1][1]);
		
		String[] words = {"Hii","Hello"};
		System.out.println(words[1]);
		
		String[][] texts = {
				{"Hii","Hello"},
				{"one","two"}
		};
		System.out.println(texts[1][1]);
		
		String[][] msgs = new String[2][2];
		msgs[0][0]="Hii there";
		System.out.println(msgs[0][0]);
		
		for(int row=0;row<grid.length;row++)
		{
			for(int col=0;col<grid[row].length;col++)
			{
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}
		
		
		}
	}



package chapter7;

import java.util.Arrays;

public class TotalSalesTwoDim {

	public static void main(String[] args) {
		
		SaleSlip sp = new SaleSlip();
		
		int[][]comPlusTotalSales = new int[5][4];
		
		for(int[] currentRow  : comPlusTotalSales) {
			int index = currentRow.length;
			for(int currentSale : currentRow) {
				System.out.print("starting from 0 to "+index+ " ");
				sp.setSalesPersonNumber();
				sp.setProductNumber();
				sp.setProductPrice();
				comPlusTotalSales[sp.getSalesPersonNumber()][sp.getProductNumber()] = sp.getProductPrice();
				index--;
			}
		}
		
		int productRow0 = comPlusTotalSales[0][0] + comPlusTotalSales[0][1] + comPlusTotalSales[0][2] + comPlusTotalSales[0][3];
		int productRow1 = comPlusTotalSales[1][0] + comPlusTotalSales[1][1] + comPlusTotalSales[1][2] + comPlusTotalSales[1][3];
		int productRow2 = comPlusTotalSales[2][0] + comPlusTotalSales[2][1] + comPlusTotalSales[2][2] + comPlusTotalSales[2][3];
		int productRow3 = comPlusTotalSales[3][0] + comPlusTotalSales[3][1] + comPlusTotalSales[3][2] + comPlusTotalSales[3][3];
		int productRow4 = comPlusTotalSales[4][0] + comPlusTotalSales[4][1] + comPlusTotalSales[4][2] + comPlusTotalSales[4][3];
		
		int salesPerson0 = comPlusTotalSales[0][0]+ comPlusTotalSales[1][0] + comPlusTotalSales[2][0]+ comPlusTotalSales[3][0] + comPlusTotalSales[4][0];
		int salesPerson1 = comPlusTotalSales[0][1]+ comPlusTotalSales[1][1] + comPlusTotalSales[2][1]+ comPlusTotalSales[3][1] + comPlusTotalSales[4][1];
		int salesPerson2 = comPlusTotalSales[0][2]+ comPlusTotalSales[1][2] + comPlusTotalSales[2][2]+ comPlusTotalSales[3][2] + comPlusTotalSales[4][2];
		int salesPerson3 = comPlusTotalSales[0][3]+ comPlusTotalSales[1][3] + comPlusTotalSales[2][3]+ comPlusTotalSales[3][3] + comPlusTotalSales[4][3];
		
		System.out.println("The column calculates total sales by each sale person while the row for each product");
		for(int printRow = 0; printRow < comPlusTotalSales.length; printRow++) {
			if (printRow == 0){
				System.out.println(Arrays.toString(comPlusTotalSales[0])+ "= "+productRow0);
			}
			else if(printRow == 1) {
				System.out.println(Arrays.toString(comPlusTotalSales[1])+ "= "+productRow1);
			}
			else if(printRow == 2) {
				System.out.println(Arrays.toString(comPlusTotalSales[2])+ "= "+productRow2);
			}
			else if (printRow == 3){
				System.out.println(Arrays.toString(comPlusTotalSales[3])+ "= "+productRow3);
			}
			else {
				System.out.println(Arrays.toString(comPlusTotalSales[4])+ "= "+productRow4);
			}
		}
		System.out.printf("%d  %d  %d  %d%n",salesPerson0,salesPerson1,salesPerson2,salesPerson3);

	}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package displayrent;

/**
 *
 * @author mac
 */
public class DisplayRent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] rents = { {400, 450, 510},
{500, 560, 630},
{625, 676, 740},
{1000, 1250, 1600} };
int floor;
int bdrms;
for(floor = 0; floor < rents.length; ++floor)
for(bdrms = 0; bdrms < rents[floor].length; ++bdrms)
System.out.println("Floor " + floor +
" Bedrooms " + bdrms + " Rent is $" +
rents[floor][bdrms]);
    }
    
}

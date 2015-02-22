import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.*;
import java.lang.Integer;
import java.io.*;
public class ContributersByIndustry {
	
	public static void main(String[] args)
	{
		
		//User enters the location of the sector codes file
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sector codes location: ");
		System.out.println("---Example: \"src/Sector_Codes.csv\"---");
		String s = input.next();
		//input.close();
		File sectorCodes = new File(s);
		
		
		//Creates ArrayLists for the sector codes and their corresponding industries
		List<String> codes = new ArrayList<String>();
		List<String> industry = new ArrayList<String>();
		
		//Adds sector codes and industries to their respective ArrayLists
		try
		{
		
			Scanner scan = new Scanner(sectorCodes);
			
			scan.useDelimiter(",");
			
			boolean pick = true;
			

			
			while(scan.hasNext())
			{
				if(pick == true)
				{
					codes.add(scan.next());
					pick = false;
				}
				
				else
				{
					industry.add(scan.next());
					pick = true;
				}
				
			}
			
			scan.close();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		//Removes the header in the CSV from both ArrayLists
		codes.remove(0);
		industry.remove(0);
		
		//User enters the location of the CRP code file
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter CRP code location: ");
		System.out.println("---Example: \"src/CRPs_IDs.csv\"---");
		String s2 = input2.next();
		File crp = new File(s2);
		
		//Creates ArrayLists for the CRP IDs and their corresponding congresspeople
		List<String> IDs = new ArrayList<String>();
		List<String> names = new ArrayList<String>();
		
		//Adds CRP IDs and congresspeople to their respective ArrayLists
		try
		{
		
			Scanner scanner = new Scanner(crp);
			
			scanner.useDelimiter(",   ");
			
			boolean pick = true;

			while(scanner.hasNext())
			{
				if(pick == true)
				{
					IDs.add(scanner.next());
					pick = false;
				}
				
				else
				{
					names.add(scanner.nextLine());
					pick = true;
				}
				
			}
			
			scanner.close();
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		//Removes header from first element of the ID ArrayList
		IDs.set(0, IDs.get(0).substring(12));
		
		//Removes excess spaces and commas from each of the ArrayList elements in the name ArrayList
		for(int i = 0; i < names.size(); i++)
		{
			names.set(i, names.get(i).substring(5, names.get(i).length() -1));
		}
		
		//User enters the location of the targeted congress people file
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter targeted congresspeople location: ");
		System.out.println("---Example: \"src/CongressPeopleCRP.csv\"---");
		String s3 = input3.next();
		File CRP = new File(s3);
		
		//Creates an ArrayList to hold the CRP IDs of the targeted congresspeople
		List<String> congressCRPs = new ArrayList<String>();
		
		//Adds the CRP codes of the targeted congress people to the ArrayList
		try
		{
		
			Scanner scanner = new Scanner(CRP);

			while(scanner.hasNext())
			{
				congressCRPs.add(scanner.next());
			}
		}
		
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		int i = 0;
		int x = 0;
		
		List<String> chosenPeople = new ArrayList<String>();
		
		while(i < IDs.size() && x < congressCRPs.size())
		{
			if(IDs.get(i).equals(congressCRPs.get(x)))
			{
				chosenPeople.add(names.get(i));
				x+=1;
				i = 0;
			}
			
			i++;
			
		}
		
		System.out.println(chosenPeople);
		
		List<String> contributors = new ArrayList<String>();
		
		File contribs = new File("src/ReneeElmersContributors.csv");
		
		try
		{
			
			Scanner myScanner = new Scanner(contribs);
			
			while(myScanner.hasNextLine())
			{
				contributors.add(myScanner.nextLine());
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		Collections.sort(contributors);
		
		System.out.println(contributors);
		
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		int E = 0;
		int F = 0;
		int G = 0;
		int H = 0;
		int J11	= 0;	
		int J12	= 0;
		int J22	= 0;	
		int J21	= 0;
		int J51	= 0;
		int J52	= 0;
		int J61 = 0;
		int J62	= 0;
		int J712 = 0;
		int J715 = 0;	
		int J72	= 0;	
		int J73	= 0;
		int J74 = 0;	
		int J75	= 0;
		int J8 = 0;	
		int JD1 = 0;	
		int JD2 = 0;
		int JE3	= 0;
		int JH1	= 0;	
		int Z = 0;	
		int L = 0;
		int K12	= 0;
		int K0	= 0;	
		int K2	= 0;		
		int M	= 0;	
		int T	= 0;	
		int X	= 0;
		int Y	= 0;
		
		int a = 0;
		
		while(a < contributors.size())
		{
			if(contributors.get(a).startsWith("A"))
			{
				A++;
			}
			
			else if(contributors.get(a).startsWith("B"))
			{
				B++;
			}
			else if(contributors.get(a).startsWith("C"))
			{
				C++;
			}
			else if(contributors.get(a).startsWith("D"))
			{
				D++;
			}
			else if(contributors.get(a).startsWith("E"))
			{
				E++;
			}
			else if(contributors.get(a).startsWith("F"))
			{
				F++;
			}
			else if(contributors.get(a).startsWith("G"))
			{
				G++;
			}
			else if(contributors.get(a).startsWith("H"))
			{
				H++;
			}
			else if(contributors.get(a).startsWith("J11"))
			{
				J11++;
			}
			else if(contributors.get(a).startsWith("J12"))
			{
				J12++;
			}
			else if(contributors.get(a).startsWith("J22"))
			{
				J22++;
			}
			else if(contributors.get(a).startsWith("J21"))
			{
				J21++;
			}
			else if(contributors.get(a).startsWith("J51"))
			{
				J51++;
			}
			else if(contributors.get(a).startsWith("J52"))
			{
				J52++;
			}
			else if(contributors.get(a).startsWith("J61"))
			{
				J61++;
			}
			else if(contributors.get(a).startsWith("J62"))
			{
				J62++;
			}
			else if(contributors.get(a).startsWith("J712"))
			{
				J712++;
			}
			else if(contributors.get(a).startsWith("J715"))
			{
				J715++;
			}
			else if(contributors.get(a).startsWith("J72"))
			{
				J72++;
			}
			else if(contributors.get(a).startsWith("J73"))
			{
				J73++;
			}
			else if(contributors.get(a).startsWith("J74"))
			{
				J74++;
			}
			else if(contributors.get(a).startsWith("J75"))
			{
				J75++;
			}
			else if(contributors.get(a).startsWith("J8"))
			{
				J8++;
			}
			else if(contributors.get(a).startsWith("JD1"))
			{
				JD1++;
			}
			else if(contributors.get(a).startsWith("JD2"))
			{
				JD2++;
			}
			else if(contributors.get(a).startsWith("JE3"))
			{
				JE3++;
			}
			else if(contributors.get(a).startsWith("JH1"))
			{
				JH1++;
			}
			else if(contributors.get(a).startsWith("Z"))
			{
				Z++;
			}
			else if(contributors.get(a).startsWith("L"))
			{
				L++;
			}
			else if(contributors.get(a).startsWith("K12"))
			{
				K12++;
			}
			else if(contributors.get(a).startsWith("K0"))
			{
				K0++;
			}
			else if(contributors.get(a).startsWith("K2"))
			{
				K2++;
			}
			else if(contributors.get(a).startsWith("M"))
			{
				M++;
			}
			else if(contributors.get(a).startsWith("T"))
			{
				T++;
			}
			else if(contributors.get(a).startsWith("X"))
			{
				X++;
			}
			else if(contributors.get(a).startsWith("Y"))
			{
				Y++;
			}
			a++;
		}
		
		int[] conts = new int[36];
		
		conts[0] = A;
		conts[1] = B;
		conts[2] = C;
		conts[3] = D;
		conts[4] = E;
		conts[5] = F;
		conts[6] = G;
		conts[7] = H;
		conts[8] = J11;
		conts[9] = J12;
		conts[10] = J21;
		conts[11] = J22;
		conts[12] = J51;
		conts[13] = J52;
		conts[14] = J61;
		conts[15] = J62;
		conts[16] = J712;
		conts[17] = J715;
		conts[18] = J72;
		conts[19] = J73;
		conts[20] = J74;
		conts[21] = J75;
		conts[22] = J8;
		conts[23] = JD1;
		conts[24] = JD2;
		conts[25] = JE3;
		conts[26] = JH1;
		conts[27] = K0;
		conts[28] = K12;
		conts[29] = K2;
		conts[30] = L;
		conts[31] = M;
		conts[32] = T;
		conts[33] = X;
		conts[34] = Y;
		conts[35] = Z;
		
		int l = 0;
		
		for(int t : conts)
		{
			System.out.print(industry.get(l) + ": ");
			System.out.println(t);
			l++;
		}
		
//		File finalContributions = new File("src/FinalContribs.csv");
//		
//		try {
//		
//		FileWriter myWriter = new FileWriter(finalContributions);
//		int m = 0;
//		while(m < conts.length)
//		{
//			myWriter.write("" + conts[m]);
//			m++;
//		}
//		
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace();
//		}
		
		
		
	}

}

import java.io.*;
import java.util.*;
import java.math.*;

public class covar
{
	public static double expected_value(double[]stock_one)
	{
		double expected_val =0;
		double sum =0;
		
		for (int i = 0; i<365; i++ )
		{
			sum=sum+stock_one[i];
		}
		
		expected_val=sum/365;
		
		return expected_val;
	}
	

	
	public static double covariance (double [] stock_one, double [] stock_two)
	{
		double covari=0;
		double sum =0;
		
		double evsone = expected_value(stock_one);
		double evstwo = expected_value(stock_two);
		
		for (int i = 0; i<365; i++ )
		{
			sum=(sum+((stock_one[i]-evsone)*(stock_two[i]-evstwo)));
		}	
		
		covari = sum/364;
		covari = covari*1000000;
		covari = Math.round(covari);
		covari = covari /1000000;
		return covari;
	}
	
	public static void main (String[] args)
	{
		int num = 366;
		
		//the arrays to hold the prices
		double [] aapl_prices= new double [num];
		double [] dis_prices= new double [num];
		double [] cvs_prices= new double [num];
		double [] ua_prices= new double [num];
		double [] luv_prices= new double [num];
		double [] f_prices= new double [num];
		double [] azo_prices= new double [num];
		double [] wtw_prices= new double [num];
		double [] gs_prices= new double [num];
		double [] mcd_prices= new double [num];
		
		//ints to hold stock name index when parsing
		//I could parse with by finding the comma seperators but i wont
		int  AAPL_index, DIS_index, CVS_index, UA_index, LUV_index, F_index, AZO_index, WTW_index, GS_index, MCD_index;
		int m_index = 0;
		
		//uhh the csv file
		String csv_file ="/Users/john/Desktop/10 Stocks 01.14.2016.csv";
		
		//uhh making a file to use with the scanner
		File file = new File(csv_file);
		
        try
        {
        	
        	//starting scanner with file in constructor
            Scanner inputStream = new Scanner(file);

            //just a while statement that takes lines
            while(inputStream.hasNext())
            {

                String data = inputStream.next();

                //this would not work if i had repeating things on my string but it works here and it will be simple
                AAPL_index = (data.indexOf("AAPL")+6);
                DIS_index = data.indexOf("DIS")+5;
                CVS_index = data.indexOf("CVS")+5;
                UA_index = data.indexOf("UA")+4;
                LUV_index = data.indexOf("LUV")+5;
                F_index = data.indexOf("F")+3;
                AZO_index = data.indexOf("AZO")+5;
                WTW_index = data.indexOf("WTW")+5;
                GS_index = data.indexOf("GS")+4;
                MCD_index = data.indexOf("MCD")+5;
                
                
                //substrings to add in the values
                
        		aapl_prices[m_index]= Double.parseDouble(data.substring(AAPL_index,(AAPL_index+12)));
        		dis_prices[m_index]= Double.parseDouble(data.substring(DIS_index,(DIS_index+12)));
        		cvs_prices[m_index]= Double.parseDouble(data.substring(CVS_index,(CVS_index+12)));
        		ua_prices[m_index]= Double.parseDouble(data.substring(UA_index,(UA_index+12)));
        		luv_prices[m_index]= Double.parseDouble(data.substring(LUV_index,(LUV_index+12)));
        		f_prices[m_index]= Double.parseDouble(data.substring(F_index,(F_index+12)));
        		azo_prices[m_index]= Double.parseDouble(data.substring(AZO_index,(AZO_index+12)));
        		wtw_prices[m_index]= Double.parseDouble(data.substring(WTW_index,(WTW_index+12)));
        		gs_prices[m_index]= Double.parseDouble(data.substring(GS_index,(GS_index+12)));
        		mcd_prices[m_index]= Double.parseDouble(data.substring(MCD_index,(MCD_index+12)));
                          
        		m_index=m_index+1;

            }

            //close the streamline
            inputStream.close();
            
            //for my try statement
        }catch (FileNotFoundException e)
        {

            System.out.println("Something is wrong with opening the file - Line 30");
        }		
		
        
////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // alright so this is where the mathy stuff starts.. I guess not there wasn't too much math LMAOO
        
        
		//public static double covariance (double [] stock_one, double [] stock_two)
        
        
        //I could do this with import org.eclipse.swt.SWT and tables columns but I'm so close to being finished
        
        System.out.println("                AAPL,     DIS,        CVS,             UA,          LUV,        F,              AZO,            WTW,            GS,             MCD");
        System.out.println("AAPL"+"          "+covariance(aapl_prices,aapl_prices)+"     "+covariance(aapl_prices,dis_prices)+"      "+covariance(aapl_prices,cvs_prices)+"        "+covariance(aapl_prices,ua_prices)+"        "+covariance(aapl_prices,luv_prices)+"        "+covariance(aapl_prices,f_prices)+"        "+covariance(aapl_prices,azo_prices)+"        "+covariance(aapl_prices,wtw_prices)+"        "+covariance(aapl_prices,gs_prices)+"        "+covariance(aapl_prices,mcd_prices));
        System.out.println(" DIS"+"          "+covariance(dis_prices,aapl_prices)+"      "+covariance(dis_prices,dis_prices)+"     "+covariance(dis_prices,cvs_prices)+"        "+covariance(dis_prices,ua_prices)+"        "+covariance(dis_prices,luv_prices)+"        "+covariance(dis_prices,f_prices)+"        "+covariance(dis_prices,azo_prices)+"        "+covariance(dis_prices,wtw_prices)+"        "+covariance(dis_prices,gs_prices)+"        "+covariance(dis_prices,mcd_prices));
        System.out.println(" CVS"+"          "+covariance(cvs_prices,aapl_prices)+"      "+covariance(cvs_prices,dis_prices)+"     "+covariance(cvs_prices,cvs_prices)+"        "+covariance(cvs_prices,ua_prices)+"        "+covariance(cvs_prices,luv_prices)+"        "+covariance(cvs_prices,f_prices)+"        "+covariance(cvs_prices,azo_prices)+"        "+covariance(cvs_prices,wtw_prices)+"        "+covariance(cvs_prices,gs_prices)+"        "+covariance(cvs_prices,mcd_prices));
        System.out.println("  UA"+"          "+covariance(ua_prices,aapl_prices)+"      "+covariance(ua_prices,dis_prices)+"      "+covariance(ua_prices,cvs_prices)+"        "+covariance(ua_prices,ua_prices)+"        "+covariance(ua_prices,luv_prices)+"        "+covariance(ua_prices,f_prices)+"        "+covariance(ua_prices,azo_prices)+"        "+covariance(ua_prices,wtw_prices)+"        "+covariance(ua_prices,gs_prices)+"        "+covariance(ua_prices,mcd_prices));		
        System.out.println(" LUV"+"          "+covariance(luv_prices,aapl_prices)+"      "+covariance(luv_prices,dis_prices)+"     "+covariance(luv_prices,cvs_prices)+"        "+covariance(luv_prices,ua_prices)+"        "+covariance(luv_prices,luv_prices)+"        "+covariance(luv_prices,f_prices)+"        "+covariance(luv_prices,azo_prices)+"        "+covariance(luv_prices,wtw_prices)+"        "+covariance(luv_prices,gs_prices)+"        "+covariance(luv_prices,mcd_prices));
        System.out.println("   F"+"          "+covariance(f_prices,aapl_prices)+"      "+covariance(f_prices,dis_prices)+"       "+covariance(f_prices,cvs_prices)+"        "+covariance(f_prices,ua_prices)+"        "+covariance(f_prices,luv_prices)+"        "+covariance(f_prices,f_prices)+"        "+covariance(f_prices,azo_prices)+"        "+covariance(f_prices,wtw_prices)+"        "+covariance(f_prices,gs_prices)+"        "+covariance(f_prices,mcd_prices));
        System.out.println(" AZO"+"          "+covariance(azo_prices,aapl_prices)+"      "+covariance(azo_prices,dis_prices)+"      "+covariance(azo_prices,cvs_prices)+"        "+covariance(azo_prices,ua_prices)+"        "+covariance(azo_prices,luv_prices)+"        "+covariance(azo_prices,f_prices)+"        "+covariance(azo_prices,azo_prices)+"        "+covariance(azo_prices,wtw_prices)+"        "+covariance(azo_prices,gs_prices)+"        "+covariance(azo_prices,mcd_prices));
        System.out.println(" WTW"+"          "+covariance(wtw_prices,aapl_prices)+"      "+covariance(wtw_prices,dis_prices)+"      "+covariance(wtw_prices,cvs_prices)+"        "+covariance(wtw_prices,ua_prices)+"        "+covariance(wtw_prices,luv_prices)+"        "+covariance(wtw_prices,f_prices)+"        "+covariance(wtw_prices,azo_prices)+"        "+covariance(wtw_prices,wtw_prices)+"        "+covariance(wtw_prices,gs_prices)+"        "+covariance(wtw_prices,mcd_prices));        
        System.out.println("  GS"+"          "+covariance(gs_prices,aapl_prices)+"      "+covariance(gs_prices,dis_prices)+"      "+covariance(gs_prices,cvs_prices)+"        "+covariance(gs_prices,ua_prices)+"        "+covariance(gs_prices,luv_prices)+"        "+covariance(gs_prices,f_prices)+"        "+covariance(gs_prices,azo_prices)+"        "+covariance(gs_prices,wtw_prices)+"        "+covariance(gs_prices,gs_prices)+"        "+covariance(gs_prices,mcd_prices));
        System.out.println(" MCD"+"          "+covariance(mcd_prices,aapl_prices)+"      "+covariance(mcd_prices,dis_prices)+"         "+covariance(mcd_prices,cvs_prices)+"        "+covariance(mcd_prices,ua_prices)+"        "+covariance(mcd_prices,luv_prices)+"        "+covariance(mcd_prices,f_prices)+"        "+covariance(mcd_prices,azo_prices)+"        "+covariance(mcd_prices,wtw_prices)+"        "+covariance(mcd_prices,gs_prices)+"        "+covariance(mcd_prices,mcd_prices));
        
	}
	
	
}
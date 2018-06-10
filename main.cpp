#include <iostream>
#include <random>
#include <math.h>
#include <cstdlib>
#include <time.h>
#include <iomanip>

using namespace std;

default_random_engine generator;
normal_distribution<double> distribution(0.0,1.0);

int main()
{
    srand(time(NULL));
    
    
    //JUST SOME SETTINGS
    double r_one, r_two,r_three,r_four,r_five,r_six,r_seven,r_eight, r_nine, r_ten, r_temp;
    double s_one, s_two,s_three,s_four,s_five,s_six,s_seven,s_eight, s_nine, s_ten, s_temp;
    double s_onev, s_twov,s_threev,s_fourv,s_fivev,s_sixv,s_sevenv,s_eightv, s_ninev, s_tenv;
    
    double e;
    double risk_free_rate=.22;
    double change_in_time=0.00074200913;
    double volatility;
    int days = 1; //365 6.5 hour days
    
    
    
    s_temp =0;
    s_one=97.39;
    s_two=98.43;
    s_three=94.1;
    s_four=71.87;
    s_five=40.39;
    s_six=12.2;
    s_seven=704.19;
    s_eight=14.72;
    s_nine=158.94;
    s_ten=115.13;
    
    s_onev=.268;
    s_twov=.3159;
    s_threev=.2622;
    s_fourv=.3427;
    s_fivev=.424;
    s_sixv=.3198;
    s_sevenv=.2681;
    s_eightv=1.1242;
    s_ninev=.3107;
    s_tenv=.2779;
    
    //MORE STOCKS HERE
    
    for (int i =0; i<=365; i++)
    {
        //MORE RANDOMIZATION JUST BECASUE
        for (int j=1;j<=(rand()%1999);j++)
        {
            e = distribution(generator);
        }
        
        volatility= s_onev;
        s_temp= s_one;
        s_one = s_one*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_one = (s_one-s_temp)/s_temp;
        
        for (int j=1;j<=(rand()%18723);j++)
        {
            e = distribution(generator);
        }
        volatility= s_twov;
        s_temp= s_two;
        s_two = s_two*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_two = (s_two-s_temp)/s_temp;
        
        
        for (int j=1;j<=(rand()%912989);j++)
        {
            e = distribution(generator);
        }
        
        volatility= s_threev;
        s_temp= s_three;
        s_three = s_three*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_three = (s_three-s_temp)/s_temp;
        
        
        for (int j=1;j<=(rand()%6628736);j++)
        {
            e = distribution(generator);
        }
        
        volatility= s_fourv;
        s_temp= s_four;
        s_four = s_four*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_four = (s_four-s_temp)/s_temp;
        
        for (int j=1;j<=(rand()%111238971);j++)
        {
            e = distribution(generator);
        }
        
        volatility= s_fivev;
        s_temp= s_five;
        s_five = s_five*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_five = (s_five-s_temp)/s_temp;
        
        for (int j=1;j<=(rand()%8112301);j++)
        {
            e = distribution(generator);
        }
        
        volatility= s_sixv;
        s_temp= s_six;
        s_six = s_six*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_six = (s_six-s_temp)/s_temp;
        
        for (int j=1;j<=(rand()%8612390);j++)
        {
            e = distribution(generator);
        }
        
        volatility= s_sevenv;
        s_temp= s_seven;
        s_seven = s_seven*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_seven = (s_seven-s_temp)/s_temp;
        
        for (int j=1;j<=(rand()%34567);j++)
        {
            e = distribution(generator);
        }
        
        volatility= s_eightv;
        s_temp= s_eight;
        s_eight = s_eight*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_eight = (s_eight-s_temp)/s_temp;
        
        
        for (int j=1;j<=(rand()%890123);j++)
        {
            e = distribution(generator);
        }
        
        volatility= s_ninev;
        s_temp= s_nine;
        s_nine = s_nine*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_nine = (s_nine-s_temp)/s_temp;
        
        for (int j=1;j<=(rand()%456780);j++)
        {
            e = distribution(generator);
        }
        
        volatility= s_tenv;
        s_temp= s_ten;
        s_ten = s_ten*((1+risk_free_rate*change_in_time)+(volatility*e*sqrt(change_in_time)));
        r_ten = (s_ten-s_temp)/s_temp;
        
        
        cout<<setfill('0')<<setw(3)<<days<<",'AAPL',"<<r_one<<",'DIS',"<<r_two<<",'CVS',"<<r_three<<",'UA',"<<r_four<<",'LUV',"<<r_five<<",'F',"<<r_six<<",'AZO',"<<r_seven<<",'WTW',"<<r_eight<<",'GS',"<<r_nine<<",'MCD',"<<r_ten<<endl;
        
        days++;
    }
    
    
    cout<<endl;
    
    
    
    return(0);
    
}

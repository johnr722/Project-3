#include "s_url_d.h"
#include <iostream>
#include <string>


using namespace std;

s_url_d::s_url_d(string stocks [], int num_stocks)
{
    s_url = url_builder(stocks, num_stocks);
    cout<<s_url<<endl;
    
    
   string command = commmand_builder(s_url);
    
   cout<<command<<endl;
    
   system((command).c_str());
}

string s_url_d::url_builder(string stocks [], int num_stocks)
{
    string b_url = "http://finance.yahoo.com/d/quotes.csv?s=";
    
    string url = b_url;
    
    for(int i=0; i <num_stocks; i++)
    {
        if(i!=num_stocks-1){
            url = url + stocks[i]+"+";
        }
        else{
            url = url + stocks[i];
        }
    }
    
    string e_url = "&f=snxabopc6k2ghkjveb4rj1";
    url = url + e_url;
    
    //http://www.jarloo.com/yahoo_finance/
    
    return url;
}

string s_url_d::commmand_builder(string url)
{
    string command = "open \""+url+"\"";
    return command;
    
}
s_url_d::~s_url_d()
{
    
}
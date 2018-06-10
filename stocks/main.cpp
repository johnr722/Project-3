#include <iostream>
#include <string>
#include "s_url_d.h"

using namespace std;

int main(int argc, const char * argv[])
{
    string stocks []= {"BAC","AAPL","MSFT","FB","AXP"};
    int s_size= sizeof(stocks)/sizeof(stocks[0]);
    
    s_url_d download (stocks, s_size);
    
    return 0;
}

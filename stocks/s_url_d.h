#ifndef __stocks__s_url_d__
#define __stocks__s_url_d__

#include <iostream>
#include <string>

using namespace std;

class s_url_d
{
public:
    s_url_d(string stocks [], int num_stocks);
    ~s_url_d();
private:
    string url_builder(string stocks [], int num_stocks);
    string commmand_builder(string url);
    string s_url;

};

#endif
#include <iostream>
#include <cmath>
#include <vector>


using namespace std ;

int main() { 
    vector<int> v1; 
    int t;  
    cin >>t; 
    int n ; 
    int elem; 
    while(t--) {
        cin >>n;
        for(int i=0 ; i<n ; ++i) {
             
            cin >>elem; 
            v1.push_back(elem); 
        }

        int i = 0; 
        bool flag = true ; 
        while(i < n && flag ) {
                int a = sqrt(v1[i]); 
                    if(a*a != v1[i]){
                          flag=false;
                        cout <<"YES\n";   
         
                }

        i++;          
        }
        cout <<"NO \n"; 
    }
    return 0; 
}
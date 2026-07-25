/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
    
        int f=1,l=n;
        while(f<=l){
            int mid=f+(l-f)/2;
            int ans=guess(mid);
            if(ans==0){
                return mid;}
              else if(ans==-1){
                l=mid-1;
              }

                else{
                    f=mid+1;
                }
            }
            return -1 ;
        }
    }

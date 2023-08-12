class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {

        Long[] result=new Long[2];
        result[0]=lcm(A,B);

        result[1]=gcd(A,B);

        return result;
        // code here
    }


    static Long gcd(Long a,Long b){
        while(b>0){
            Long temp=b;

            b=a%b;
            a=temp;
        }

        return a;

    }


    static Long lcm(Long a,Long b){
        return (a*b)/gcd(a,b);
    }
};
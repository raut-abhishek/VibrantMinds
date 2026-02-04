public class GreaterOfFive{

    public static int findGreater(int a,int b,int c,int d,int e){
        if(a>b){
            if(a>c){
                if(a>d){
                    if(a>e){
                        return a;
                    }else{
                        return e;
                    }
                }else {
                    if(d>e){
                        return d;
                    }
                    else{
                        return e;
                    }
                }
            }else{
                if(c>d){
                    if(c>e){
                        return c;
                    }else{
                        return e;
                    }
                }
                else{
                    if(d>e){
                        return d;
                    }else{
                        return e;
                    }
                }
            }
        }else{
            if(b>c){
                if(b>d){
                    if(b>e){
                        return b;
                    }else{
                        return e;
                    }
                }else{
                    if(d>e){
                        return d;
                    }else{
                        return e;
                    }
                }
            }else{
                if(c>d){
                    if(c>e){
                        return c;
                    }else{
                        return e;
                    }
                }else{
                    if(d>e){
                        return d;
                    }else{
                        return e;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int a = 10, b = 20, c = 30, d = 40, e = 50;
        System.out.println("The grater number is: " + findGreater(a,b,c,d,e));
    }
}
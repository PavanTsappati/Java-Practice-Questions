package Sliding_Window;
import java.util.*;
class FindingAnagrams {
    public static boolean fun(HashMap<Character,Integer> hm,HashMap<Character,Integer> hm1)
    {
        if(hm.size() != hm1.size())
        {
            return false;
        }
        for(char key:hm.keySet())
        {
            if(!hm1.containsKey(key))
            {
                return false;
            }
            int a=hm.get(key);
            int b=hm1.get(key);
            if(a != b)
            {
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        String p="abc";
        String s="cbaebabacd";
        int k=p.length();
      HashMap <Character,Integer> hm = new HashMap<>();
      for(int i=0;i<k;i++)
      {
          char ch=p.charAt(i);
          hm.put(ch,hm.getOrDefault(ch,0)+1);
      }
    //   System.out.println(hm);
        List<Integer> ans= new ArrayList<>();
        
         HashMap<Character,Integer> hm1=new HashMap<>();
         int n=s.length();
         int l=0;
         for(int r=0;r<n;r++)
         {
             char ch=s.charAt(r);
             hm1.put(ch,hm1.getOrDefault(ch,0)+1);
             if(r-l==k)
             {
                 char chl=s.charAt(l);
                 hm1.put(chl,hm1.get(chl)-1);
                 if(hm1.get(chl)==0)
                 {
                     hm1.remove(chl);
                 }
                 l++;
             } if(r-l+1==k) {
               boolean valid=fun(hm,hm1);
               if(valid)
               {
                  ans.add(l);
               }
             }
         }System.out.print(ans);
    }
}
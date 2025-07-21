//package RecursionByStriver.Questions.StriverPlaylist.InterviewQuestions;
//
//import java.util.List;
//
//public class Q4 {
//
//    static List<String> AllSubsets(String str,String Ans,List<String> list){
//
//        if(str.isEmpty()){
//
//            list.add(Ans);
//            return list;
//
//        }
//
//        char ch=str.charAt(0);
//
//        return  AllSubsets(str.substring(1),Ans+ch,list)  AllSubsets(str.substring(1),Ans,list);
//
//
//
//    }
//
//    public static void main(String[] args) {
//
//        String str="abc";
//    }
//}

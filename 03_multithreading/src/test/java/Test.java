/**
 * @program: learning
 * @description: 测试
 * @author: bjchen
 * @create: 2020-10-06
 **/
public class Test {
    @org.junit.Test
    public void replaceWord(){
        String wordOne ="ants";
        String wordTwo="apple";
        String str ="ants on the pants";
        String[] wordArr = str.split(" ");
        StringBuilder wordNew =new StringBuilder();
        if(isChange(wordOne,wordArr[0])){
            wordNew.append(wordArr[0].replace(wordOne,wordTwo));
        }
        for (int i=1; i<wordArr.length;++i){
            if(isChange(wordOne,wordArr[i])){
                wordNew.append(" ").append(wordArr[i].replace(wordOne,wordTwo));
            }else {
                wordNew.append(" ").append(wordArr[i]);
            }
        }
        System.out.println(wordNew.toString());

    }

    private boolean isChange(String wordOne, String regWord) {
        return  wordOne.length()==regWord.length();
    }
}

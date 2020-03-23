import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JerkSON {
    // split raw data array to strings
    // make correct key value pairs by a :
    //correct case sensativity of data upper case first char lower rest
    //gaurantee every key has a value and every value has a pair
    Main main = new Main();

    /**split raw data array to strings
     *
     * @return an array of strings
     * @throws Exception
     */
    public String[] findStringParse() throws Exception{
        String[] parsedList = main.readRawDataToString().split("##");
        return parsedList;
    }


    public String parseMilk(String name)throws Exception{
        Pattern milk = Pattern.compile("[Mm][Ii][Ll][Kk]");
        Matcher correctMilkName = milk.matcher(name);
        correctMilkName.find();
        return correctMilkName.replaceAll("Milk");
    }

    public String parseBread(String name)throws Exception{
        Pattern bread = Pattern.compile("[Bb][Rr][Ee][Aa][Dd]");
        Matcher correctBreadName = bread.matcher(name);
        correctBreadName.find();
        return correctBreadName.replaceAll("Milk");
    }

    public String parseCookies(String name)throws Exception{
        Pattern cookies = Pattern.compile("[Cc][Oo0][Oo0][Kk][Ii][Ee][Ss]");
        Matcher correctCookiesName = cookies.matcher(name);
        correctCookiesName.find();
        return correctCookiesName.replaceAll("Milk");
    }

    public String parseApples(String name)throws Exception{
        Pattern apples = Pattern.compile("[Cc][Oo0][Oo0][Kk][Ii][Ee][Ss]");
        Matcher correctApplesName = apples.matcher(name);
        correctApplesName.find();
        return correctApplesName.replaceAll("Milk");
    }




}

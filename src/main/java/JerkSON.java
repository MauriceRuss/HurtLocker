import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JerkSON {
    // split raw data array to strings
    // make correct key value pairs by a :
    //correct case sensativity of data upper case first char lower rest
    //gaurantee every key has a value and every value has a pair
    Main main = new Main();
    private String foodList;

    public JerkSON(){
        this.foodList = loadFile();
    }

    private String loadFile(){
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("RawData.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        }catch(IOException e){
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getFoodList(){
        return foodList;
    }


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
        return correctBreadName.replaceAll("Bread");
    }

    public String parseCookies(String name)throws Exception{
        Pattern cookies = Pattern.compile("[Cc][Oo0][Oo0][Kk][Ii][Ee][Ss]");
        Matcher correctCookiesName = cookies.matcher(name);
        correctCookiesName.find();
        return correctCookiesName.replaceAll("Cookies");
    }

    public String parseApples(String name)throws Exception{
        Pattern apples = Pattern.compile("[Aa][Pp][Pp][Ll][Ee][Ss]");
        Matcher correctApplesName = apples.matcher(name);
        correctApplesName.find();
        return correctApplesName.replaceAll("Apples");
    }

    public String parseNameTitle(String name)throws Exception{
        Pattern nameTitle = Pattern.compile("[Nn] [Aa] [Mm] [Ee]");
        Matcher correctNameTitle = nameTitle.matcher(name);
        correctNameTitle.find();
        return correctNameTitle.replaceAll("name");
    }

    public String parsePriceTitle(String name)throws Exception{
        Pattern priceTitle = Pattern.compile("[Pp] [Ri] [Cc] [Ee]");
        Matcher correctPriceTitle = priceTitle.matcher(name);
        correctPriceTitle.find();
        return correctPriceTitle.replaceAll("Price");
    }



}

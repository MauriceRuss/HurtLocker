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
}

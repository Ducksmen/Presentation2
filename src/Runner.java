public class Runner {

    public static void main(String[] args)
    {
        String[] test = {"Despair", "Hope", "Despair"};
        WordPairList test1List = new WordPairList(test);
        System.out.println(test1List);
        System.out.println("Matches: " + test1List.numMatches());
    }
}
static int score(String word) {
    return word.replaceAll("r", "").length();
}
score("rrr")
score("rarar")
List<Integer> list1 = new ArrayList<>();
list1.add(1)
list1.add(3)
list1.add(-3)
list1.add(-13)
list1.add(-5)
list1.add(4)
list1
list1.sort(null)
list1
static Comparator<String> scoreComparator = new Comparator<String>() {
    public int compare(String w1, String w2) {
        return Integer.compare(score(w2), score(w1));
    }
};
List<String> list2 = new ArrayList<>();
list2.add("aaa")
list2.add("raa")
list2.add("rasraa")
list2.add("raaaaa")
list2.add("ddfsraaaaa")
list2.add("rrrrrrrrrra")
static List<String> rankedWords(List<String> words) {
    word.sort(scoreComparator);
    return words;
}
rankedWords(list2);
rankedWords(list2)
static int scoreWithBonus(String word) {
    int base = score(word);
    if (word.contains("f")) return base + 3;
    else return base;
}
static Comparator<String> scoreWithBonusComparator = new Comparator<String>() {
    public int compare(String w1, String w2) {
        return Integer.compare(scoreWithBonus(w2), scoreWithBonus(w1));
    }
};
package org.textanalyzer;


public class SpamAnalyzer extends KeywordAnalyzer{

    private String[] keywords;

    public SpamAnalyzer(String[] keywords){
        this.keywords = keywords;
    }

    @Override
    public Label processText(String text) {
        return null;
    }

    @Override
    public String[] getKeyWord() {
        return new String[0];
    }

    @Override
    public Label getLabel() {
        return null;
    }
}

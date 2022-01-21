package org.textanalyzer;

public class NegativeTextAnalyzer extends KeywordAnalyzer{
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

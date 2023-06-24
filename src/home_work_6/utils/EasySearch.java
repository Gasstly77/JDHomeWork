package home_work_6.utils;

import home_work_6.api.ISearchEngine;
public class EasySearch implements ISearchEngine {

    @Override
    public long search(String text, String word) {
        int checkIndex = 0;
        int wordLength = word.length();
        long wordCounter = 0;
        if (wordLength == 0) {
            checkIndex = -1;
        } else {
            checkIndex = text.indexOf(word, checkIndex);
        }
        while (checkIndex >= 0) {
            int endWord = checkIndex + wordLength - 1;
            if (endWord >= text.length()) {
                checkIndex = -1;
            }
            if (checkIndex == 0) {
                if (endWord == text.length()-1) {
                    ++wordCounter;
                    checkIndex = text.indexOf(word, endWord+1);
                }
                else if (!Character.isLetter(text.charAt(endWord+1)) && !Character.isDigit(text.charAt(endWord+1))) {
                    if (String.valueOf(text.charAt(endWord+1)).equals("-")) {
                        if (endWord+2 < text.length() && (Character.isLetter(text.charAt(endWord+2)) || Character.isDigit(text.charAt(endWord+2)))) {
                            checkIndex = text.indexOf(word, endWord+1);
                        } else {
                            ++wordCounter;
                            checkIndex = text.indexOf(word, endWord + 1);
                        }
                    } else {
                        ++wordCounter;
                        checkIndex = text.indexOf(word, endWord + 1);
                    }
                } else {
                    checkIndex = text.indexOf(word, endWord+1);
                }
            } else {
                if (endWord == text.length()-1){
                    if (!Character.isLetter(text.charAt(checkIndex-1)) && !Character.isDigit(text.charAt(checkIndex-1))) {
                        if (String.valueOf(text.charAt(checkIndex-1)).equals("-")) {
                            if (checkIndex-2 >= 0  && (Character.isLetter(text.charAt(checkIndex-2)) || Character.isDigit(text.charAt(checkIndex-2)))) {
                                checkIndex = text.indexOf(word, endWord+1);
                            } else {
                                ++wordCounter;
                                checkIndex = text.indexOf(word, endWord + 1);
                            }
                        } else {
                            ++wordCounter;
                            checkIndex = text.indexOf(word, endWord + 1);
                        }
                    } else {
                        checkIndex = text.indexOf(word, endWord+1);
                    }
                } else if (!Character.isLetter(text.charAt(endWord+1)) && !Character.isDigit(text.charAt(endWord+1))) {
                    if (!Character.isLetter(text.charAt(checkIndex-1)) && !Character.isDigit(text.charAt(checkIndex-1))) {
                        if (String.valueOf(text.charAt(endWord+1)).equals("-")) {
                            if (endWord+2 < text.length() && (Character.isLetter(text.charAt(endWord+2)) || Character.isDigit(text.charAt(endWord+2)))) {
                                checkIndex = text.indexOf(word, endWord+1);
                            } else {
                                ++wordCounter;
                                checkIndex = text.indexOf(word, endWord + 1);
                            }
                        } else {
                            ++wordCounter;
                            checkIndex = text.indexOf(word, endWord + 1);
                        }
                    } else {
                        checkIndex = text.indexOf(word, endWord+1);
                    }
                } else {
                    checkIndex = text.indexOf(word, endWord+1);
                }
            }
        }
        return wordCounter;
    }
}

package com.tinh.ailtriuph;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class cauhoi implements List<Question> {
    private int number;
    private String content;
    private List<Answer> listAnswer;

    public cauhoi(int number, String content, List<Answer> listAnswer) {
        this.number = number;
        this.content = content;
        this.listAnswer = listAnswer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Answer> getListAnswer() {
        return listAnswer;
    }

    public void setListAnswer(List<Answer> listAnswer) {
        this.listAnswer = listAnswer;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(@Nullable Object o) {
        return false;
    }

    @NonNull
    @Override
    public Iterator<Question> iterator() {
        return null;
    }

    @NonNull
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @NonNull
    @Override
    public <T> T[] toArray(@NonNull T[] a) {
        return null;
    }

    @Override
    public boolean add(Question question) {
        return false;
    }

    @Override
    public boolean remove(@Nullable Object o) {
        return false;
    }

    @Override
    public boolean containsAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(@NonNull Collection<? extends Question> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, @NonNull Collection<? extends Question> c) {
        return false;
    }

    @Override
    public boolean removeAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(@NonNull Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Question get(int index) {
        return null;
    }

    @Override
    public Question set(int index, Question element) {
        return null;
    }

    @Override
    public void add(int index, Question element) {

    }

    @Override
    public Question remove(int index) {
        return null;
    }

    @Override
    public int indexOf(@Nullable Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(@Nullable Object o) {
        return 0;
    }

    @NonNull
    @Override
    public ListIterator<Question> listIterator() {
        return null;
    }

    @NonNull
    @Override
    public ListIterator<Question> listIterator(int index) {
        return null;
    }

    @NonNull
    @Override
    public List<Question> subList(int fromIndex, int toIndex) {
        return null;
    }
}

package com.company.task3;

public class Population {
    public static void main(String[] args) {
        var a:array [1..1000] of integer;
        n, i, k, p:integer;
        begin
                writeln("Введите количество домов");
        readln(n);
        writeln("Вводите через пробел число жителей каждого дома");
        for i:=1 to n do
            begin
                    read(a[i]);
        if i mod 2=1 then k:=k+a[i]
        else p:=p+a[i];
        end;
        writeln;
        if k>p then writeln("В нечетных домах");
        else writeln("В четных домах");




    }
}

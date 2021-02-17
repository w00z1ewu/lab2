package com.company;

public class WrapperString {

    String strvalue;

    public WrapperString(String str) {
        strvalue = str;
    }

    public String getStrvalue() {
        return strvalue;
    }

    public void setStrvalue(String strvalue) {
        this.strvalue = strvalue;
    }

    @Override
    public String toString() {
        return strvalue;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj.getClass() != WrapperString.class) return false;
        if(strvalue == ((WrapperString) obj).strvalue) return true;
        return false;
    }

    public void replace(char oldchar, char newchar)
    {
        strvalue = strvalue.replace(oldchar, newchar);
    }
}

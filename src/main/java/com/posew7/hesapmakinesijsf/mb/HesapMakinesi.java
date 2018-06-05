
package com.posew7.hesapmakinesijsf.mb;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


@Named(value = "hesapMakinesi")
@RequestScoped
public class HesapMakinesi {


    public HesapMakinesi() {
    }
    
    private Double sayi1;
    private Double sayi2;
    private Double sonuc;

    public Double getSayi1() {
        return sayi1;
    }

    public void setSayi1(Double sayi1) {
        this.sayi1 = sayi1;
    }

    public Double getSayi2() {
        return sayi2;
    }

    public void setSayi2(Double sayi2) {
        this.sayi2 = sayi2;
    }

    public Double getSonuc() {
        return sonuc;
    }

    public void setSonuc(Double sonuc) {
        this.sonuc = sonuc;
    }
    
    public String topla(){
        sonuc = sayi1 + sayi2;
        return "";
    }
    public String cikar(){
        sonuc = sayi1 - sayi2;
        return "";
    }
    public String carp(){
        sonuc = sayi1 * sayi2;
        return "";
    }
    public String bol(){
        sonuc = sayi1 / sayi2;
        return "";
    }
    
}

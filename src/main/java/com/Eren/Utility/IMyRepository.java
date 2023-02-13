package com.Eren.Utility;


/**
 * Iliskisel ya da iliskisel olamayan tum DB yapilarinda kullanilmak uzere genisletilebilir
 * entegre edilebilir bir sistem kullanmak icin bu inteface kullanilacaktir,
 * <T> Entity icin type belirtir.(Musteri,Product)
 * <ID> Entity icindeki @id ile belirlenmis idyi temsil eder, bu idnin type i girilmelidir.
 */
public interface IMyRepository <T,ID>{

}

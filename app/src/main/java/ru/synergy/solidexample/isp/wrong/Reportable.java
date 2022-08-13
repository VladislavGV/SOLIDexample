package ru.synergy.solidexample.isp.wrong;

public interface Reportable { //генерация отчетов
    String generateExcel();  // генерация отчетов в Эксель

    String generatePdf();    // генерация отчетов в ПДФ
}

package com.encuesta.app.utility;

import com.encuesta.app.entity.ReportePmaEntity;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GeneratePdfReportPma {

	public static ByteArrayInputStream citiesReport(List<ReportePmaEntity> reportePmaEntity) {

		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();

		Font font=new Font();
		font.setColor(BaseColor.RED);

		try {


			PdfPTable table = new PdfPTable(6);
			table.setWidthPercentage(100);
			table.setWidths(new int[] {7,2,2,2,2,2 });

			Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

			Paragraph p=new Paragraph();
			p.add( new Paragraph("Nombre: ",font));

			PdfPCell hcell;
			hcell = new PdfPCell(new Phrase("APTITUDES MENTALES PRIMARIAS (PMA)", headFont));
			hcell.setColspan(6);
			hcell.setPadding(5);
			hcell.setTop(5);
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("FACTOR", headFont));
			hcell.setRowspan(2);
			hcell.setPaddingTop(15);
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("NIVELES", headFont));
			hcell.setColspan(5);
			hcell.setPadding(5);
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Bajo", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Tend. Bajo", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Promedio", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Tend. Alto", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			hcell = new PdfPCell(new Phrase("Alto", headFont));
			hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
			table.addCell(hcell);

			for (ReportePmaEntity reporPma : reportePmaEntity) {

				PdfPCell cell;

				cell = new PdfPCell(new Phrase(reporPma.getNompdf()));
				cell.setPadding(5);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_JUSTIFIED);
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(String.valueOf(reporPma.getBajo())));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setPaddingRight(5);
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(reporPma.getTen_bjo()));
				cell.setPaddingLeft(5);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(String.valueOf(reporPma.getPromedio())));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setPaddingRight(5);
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(reporPma.getTen_alto()));
				cell.setPaddingLeft(5);
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(cell);

				cell = new PdfPCell(new Phrase(String.valueOf(reporPma.getAlto())));
				cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setPaddingRight(5);
				table.addCell(cell);
			}


			/*document.add(new Paragraph("Fecha de nacimiento: ", font));
			document.add(new Paragraph("19/02/1998 "));

			document.add(new Paragraph("Edad: ", font));
			document.add(new Paragraph("20\n"));

			document.add(new Paragraph("Fcaultad: ", font));
			document.add(new Paragraph("Ingenieria de sistemas "));

			document.add(new Paragraph("Programa: ", font));
			document.add(new Paragraph("Programa 1 "));

			document.add(new Paragraph("Ciclo: ", font));
			document.add(new Paragraph("8° ciclo\n"));

			document.add(new Paragraph("Fecha de evaluación: ", font));
			document.add(new Paragraph("P29/10/2018\n"));*/

			PdfWriter.getInstance(document, out);
			document.open();
			document.add(p);
			document.add(table);
			document.close();

		} catch (DocumentException ex) {

			Logger.getLogger(GeneratePdfReportPma.class.getName()).log(Level.SEVERE, null, ex);
		}

		return new ByteArrayInputStream(out.toByteArray());
	}
}

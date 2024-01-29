package com.codeclause.ResumeBuilderApplication.services;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.codeclause.ResumeBuilderApplication.model.ResumeData;
import com.lowagie.text.Document;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

@Service
public class PdfService {

	Logger logger = LoggerFactory.getLogger(PdfService.class);

	public ByteArrayInputStream ResumeDownload(ResumeData rd) {

		logger.info("Create PDF Started : ");

		String firstname, lastname, rehead, resumry, address, postalcode, nationality, dateofbirth, mobile, email,
				clguniv, passingyear, classcourse, percentage, skills1, skills2, skills3, skills4, allskills,
				companyname, workdone, companyname2, workdone2;

		String title = rd.getFirstname();

		firstname = rd.getFirstname();
		lastname = rd.getLastname();
		rehead = rd.getRehead();
		resumry = rd.getResumry();
		address = rd.getAddress();
		postalcode = rd.getPostalcode();
		nationality = rd.getNationality();
		dateofbirth = rd.getDateofbirth();
		mobile = rd.getMobile();
		email = rd.getEmail();
		clguniv = rd.getClguniv();
		passingyear = rd.getPassingyear();
		classcourse = rd.getClasscourse();
		percentage = rd.getPercentage();
		skills1 = rd.getSkills1();
		skills2 = rd.getSkills2();
		skills3 = rd.getSkills3();
		skills4 = rd.getSkills4();
		allskills = rd.getAllskills();
		companyname = rd.getCompanyname();
		workdone = rd.getWorkdone();
		companyname2 = rd.getCompanyname2();
		workdone2 = rd.getWorkdone2();

		ByteArrayOutputStream outStream = new ByteArrayOutputStream();
		Document document = new Document();
		PdfWriter.getInstance(document, outStream);
		document.open();

		Paragraph headingSection = new Paragraph();

		// FONT SIZE
		Font fontSize_10 = FontFactory.getFont(FontFactory.TIMES, 10f);
		Font fontSize_12 = FontFactory.getFont(FontFactory.TIMES, 12f);
		Font fontSize_14 = FontFactory.getFont(FontFactory.TIMES, 14f);
		Font fontSize_40 = FontFactory.getFont(FontFactory.TIMES, 40f, Font.BOLD);

		// FONT STYLE
		Font fontStyle_Underline = FontFactory.getFont(FontFactory.TIMES, 10f, Font.UNDERLINE);
		Font fontStyle_Bold = FontFactory.getFont(FontFactory.TIMES, 10f, Font.BOLDITALIC);
		Font fontStyle_Normal = FontFactory.getFont(FontFactory.TIMES, 10f, Font.NORMAL);
		Font fontStyle_Italic = FontFactory.getFont(FontFactory.TIMES, 10f, Font.ITALIC);

		// FONT NAME
		Font fontname_Times = FontFactory.getFont(FontFactory.TIMES);
		Font fontname_Helvetica = FontFactory.getFont(FontFactory.HELVETICA);
		Font fontname_Courier = FontFactory.getFont(FontFactory.COURIER);
		Font fontname_ZapfDingbats = FontFactory.getFont(FontFactory.ZAPFDINGBATS);

		// FONT COLOUR - color
//		Font fontColour_Red = FontFactory.getFont(FontFactory.TIMES, 10f, Font.BOLD, BaseColor.RED);
//		Font fontColour_Yellow = FontFactory.getFont(FontFactory.TIMES, 10f, Font.BOLD, BaseColor.YELLOW);
//		Font fontColour_Blue = FontFactory.getFont(FontFactory.TIMES, 10f, Font.BOLD, BaseColor.BLUE);
//		Font fontColour_Green = FontFactory.getFont(FontFactory.TIMES, 10f, Font.BOLD, BaseColor.GREEN);

		document.add(new Paragraph(firstname + " " + lastname, fontSize_40));
		document.add(new Paragraph(rehead, fontStyle_Underline));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("Summary: "));
		document.add(new Paragraph(resumry, fontStyle_Normal));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("Address: "));
		document.add(new Paragraph(address + postalcode, fontStyle_Normal));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("Nationality: "));
		document.add(new Paragraph(nationality + ", " + dateofbirth, fontStyle_Normal));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("Contact: "));
		document.add(new Paragraph(mobile, fontStyle_Normal));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("Email: "));
		document.add(new Paragraph(email, fontStyle_Normal));
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("EDUCATIONS", fontSize_14));
		document.add(new Paragraph(clguniv));
		document.add(new Paragraph(classcourse + ", " + percentage, fontStyle_Normal));
		document.add(new Paragraph("Graduation Year: "));
		document.add(new Paragraph(passingyear, fontStyle_Normal));
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("SKILLS", fontSize_14));
		document.add(new Paragraph(skills1 + ", " + skills2 + ", " + skills3 + ", " + skills1 + ", " + allskills,
				fontStyle_Normal));
		document.add(new Paragraph(" "));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("WORK EXPERIENCE", fontSize_14));
		document.add(new Paragraph(" "));
		document.add(new Paragraph("Company Name: "));
		document.add(new Paragraph(companyname, fontStyle_Normal));
		document.add(new Paragraph("Work Done: "));
		document.add(new Paragraph(workdone, fontStyle_Normal));
		document.add(new Paragraph("Company Name2: "));
		document.add(new Paragraph(companyname2, fontStyle_Normal));
		document.add(new Paragraph("Work Done2: "));
		document.add(new Paragraph(workdone2, fontStyle_Normal));

		document.close();

		return new ByteArrayInputStream(outStream.toByteArray());
	}
}

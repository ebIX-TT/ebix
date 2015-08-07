package org.ebix.umm.templates.xsd

class DateTypesSchema {
	
	val fileName = "ebIX_DateTypeExtension.xsd"
	
    def String fileName(String directory) {
        return directory + "/" + fileName
    }
    
    def String getFileName(){
    	return fileName;
    }
	
	def compile() '''
<?xml version="1.0" encoding="UTF-8"?>
<!-- ==================================================================== -->
<!-- ===== XML Schema Builtin Type Extension XML Schema File 								    ===== -->
<!-- ==================================================================== -->
<!--
  	Schema agency: 		UN/CEFACT 
  	Schema version:		1.0 DRAFT
  	Schema date: 	    12 April 2010
  	
  	Copyright (C) UN/CEFACT (2010). All Rights Reserved.
	
	This document and translations of it may be copied and furnished to others, 
	and derivative works that comment on or otherwise explain it or assist 
	in its implementation may be prepared, copied, published and distributed, 
	in whole or in part, without restriction of any kind, provided that the 
	above copyright notice and this paragraph are included on all such copies 
	and derivative works. However, this document itself may not be modified in 
	any way, such as by removing the copyright notice or references to 
	UN/CEFACT, except as needed for the purpose of developing UN/CEFACT 
	specifications, in which case the procedures for copyrights defined in the 
	UN/CEFACT Intellectual Property Rights document must be followed, or as 
	required to translate it into languages other than English.
	
	The limited permissions granted above are perpetual and will not be revoked 
	by UN/CEFACT or its successors or assigns.
	
	This document and the information contained herein is provided on an "AS IS"
	basis and UN/CEFACT DISCLAIMS ALL WARRANTIES, EXPRESS OR IMPLIED, INCLUDING 
	BUT NOT LIMITED TO ANY WARRANTY THAT THE USE OF THE INFORMATION HEREIN WILL 
	NOT INFRINGE ANY RIGHTS OR ANY IMPLIED WARRANTIES OF MERCHANTABILITY OR 
	FITNESS FOR A PARTICULAR PURPOSE.
 -->
<xsd:schema xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xbt="urn:un:unece:uncefact:data:common:1:draft" targetNamespace="urn:un:unece:uncefact:data:common:1:draft" elementFormDefault="qualified" attributeFormDefault="unqualified">
	<!-- =================================================================== -->
	<!-- ===== Type Definitions ===== -->
	<!-- =================================================================== -->
	<!--========================-->
	<!--====== Duration types ========-->
	<!--========================-->
	<xsd:simpleType name="WeekDurationType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: nW</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="\d+W"/>
		</xsd:restriction>
	</xsd:simpleType>
	<!--========================-->
	<!--====== Date types ========-->
	<!--========================-->
	<xsd:simpleType name="DateType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-MM-DD</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:date">
			<xsd:pattern value="[0-9]{4}-[0-1][0-9]-[0-3][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: ---DD</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:gDay">
			<xsd:pattern value="---[0-3][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfYearType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -DDD</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-[0-3] [0-9]{2}"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfWeekType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -W-D</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W-[1-7]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="MonthType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: --MM--</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:gMonth">
			<xsd:pattern value="--[0-1][0-9]--"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="MonthDayType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: --MM-DD</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:gMonthDay">
			<xsd:pattern value="--[0-1][0-9]-[0-3][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="WeekType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -Www</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="WeekDayType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -Www-D</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W[0-5][0-9]-[1-7]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearDayType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-DDD</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-[0-3][0-9]{2}"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearMonthType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-MM</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:gYearMonth">
			<xsd:pattern value="[0-9]{4}-[0-1][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearWeekType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-Www</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-W[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearWeekDayType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-Www-D</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-W[0-5][0-9]-[1-7]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<!--========================-->
	<!--====== Time types ========-->
	<!--========================-->
	<xsd:simpleType name="HourLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: hh</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-2][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="HourMinuteLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-2][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="MinuteType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="MinuteSecondType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-[0-5][0-9]:[0-5][0-9].[0-9]*"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="SecondType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: --ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="--[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="TimeLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: hh:mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:time">
			<xsd:pattern value="[0-2][0-9]:[0-5][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="TimeUTCType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: hh:mm:ssZ</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:time">
			<xsd:pattern value="[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="TimeUTCOffsetType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: hh:mm:ss+hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:time">
			<xsd:pattern value="[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\+|-][0-2][0-9]:[0-6][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<!--========================-->
	<!--====== DateTime types =====-->
	<!--========================-->
	<xsd:simpleType name="DateHourLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-MM-DDThh</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DateHourMinuteLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-MM-DDThh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DateTimeLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-MM-DDThh:mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:dateTime">
			<xsd:pattern value="[0-9]{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DateTimeUTCOffsetType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-MM-DDThh:mm:ss+hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:dateTime">
			<xsd:pattern value="[0-9]{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\+|-][0-2][0-9]:[0-6][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DateTimeUTCType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-MM-DDThh:mm:ssZ</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:dateTime">
			<xsd:pattern value="[0-9]{4}-[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayHourLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: ---DDThh</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="---[0-3][0-9]T[0-2][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayHourMinuteLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: ---DDThh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="---[0-3][0-9]T[0-2][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayTimeLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: ---DDThh:mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="---[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayTimeUTCOffsetType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: ---DDThh:mm:ss+hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="---[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\+|-][0-2][0-9]:[0-6][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayTimeUTCType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: ---DDThh:mm:ssZ</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="---[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfWeekHourLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -W-DThh</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W-[1-7]T[0-2][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfWeekHourMinuteLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -W-DThh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W-[1-7]T[0-2][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfWeekTimeLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -W-DThh:mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W-[1-7]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfWeekTimeUTCOffsetType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -W-DThh:mm:ss+hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W-[1-7]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\+|-][0-2][0-9]:[0-6][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfWeekTimeUTCType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -W-DThh:mm:ssZ</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W-[1-7]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfYearHourLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -DDDThh</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-[0-3][0-9]{2}T[0-2][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfYearHourMinuteLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -DDDThh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-[0-3][0-9]{2}T[0-2][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfYearTimeLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -DDDThh:mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-[0-3][0-9]{2}T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfYearTimeUTCOffsetType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -DDDThh:mm:ss+hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-[0-3][0-9]{2}T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\+|-][0-2][0-9]:[0-6][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="DayOfYearTimeUTCType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -DDDThh:mm:ssZ</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-[0-3][0-9]{2}T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="MonthDayHourLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -MM-DDThh</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="--[0-1][0-9]-[0-3][0-9]T[0-2][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="MonthDayHourMinuteType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -MM-DDThh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="--[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="MonthDayTimeLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -MM-DDThh:mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="--[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="MonthDayTimeUTCOffsetType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -MM-DDThh:mm:ss+hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="--[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\+|-][0-2][0-9]:[0-6][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="MonthDayTimeUTCType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -MM-DDThh:mm:ssZ</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="--[0-1][0-9]-[0-3][0-9]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="WeekDayHourLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -Www-DThh</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W[0-5][0-9]-[1-7]T[0-2][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="WeekDayHourMinuteType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -Www-DThh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W[0-5][0-9]-[1-7]T[0-2][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="WeekDayTimeLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -Www-DThh:mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W[0-5][0-9]-[1-7]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="WeekDayTimeUTCOffsetType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -Www-DThh:mm:ss+hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W[0-5][0-9]-[1-7]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\+|-][0-2][0-9]:[0-6][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="WeekDayTimeUTCType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: -Www-DThh:mm:ssZ</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="-W[0-5][0-9]-[1-7]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearDayHourLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-DDDThh</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-[0-3][0-9]{2}T[0-2][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearDayHourMinuteLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-DDDThh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-[0-3][0-9]{2}T[0-2][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearDayTimeLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-DDDThh:mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-[0-3][0-9]{2}T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearDayTimeUTCOffsetType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-DDDThh:mm:ss+hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-[0-3][0-9]{2}T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\+|-][0-2][0-9]:[0-6][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearDayTimeUTCType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-DDDThh:mm:ssZ</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-[0-3][0-9]{2}T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearWeekDayHourLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-Www-DThh</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-W[0-5][0-9]-[1-7]T[0-2][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearWeekDayHourMinuteLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-Www-DThh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-W[0-5][0-9]-[1-7]T[0-2][0-9]:[0-5][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearWeekDayTimeLocalType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-Www-DThh:mm:ss</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-W[0-5][0-9]-[1-7]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearWeekDayTimeUTCOffsetType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-Www-DThh:mm:ss+hh:mm</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-W[0-5][0-9]-[1-7]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*[\+|-][0-2][0-9]:[0-6][0-9]"/>
		</xsd:restriction>
	</xsd:simpleType>
	<xsd:simpleType name="YearWeekDayTimeUTCType">
		<xsd:annotation>
			<xsd:documentation>ISO 8601 format: YYYY-Www-DThh:mm:ssZ</xsd:documentation>
		</xsd:annotation>
		<xsd:restriction base="xsd:token">
			<xsd:pattern value="[0-9]{4}-W[0-5][0-9]-[1-7]T[0-2][0-9]:[0-5][0-9]:[0-5][0-9].[0-9]*Z"/>
		</xsd:restriction>
	</xsd:simpleType>
</xsd:schema>
    '''
}
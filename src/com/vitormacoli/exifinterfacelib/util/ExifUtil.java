package com.vitormacoli.exifinterfacelib.util;

import android.media.ExifInterface;


public class ExifUtil {

	public static int[] exifOrientationConstants = 
		{
		ExifInterface.ORIENTATION_FLIP_HORIZONTAL,
		ExifInterface.ORIENTATION_FLIP_VERTICAL,
		ExifInterface.ORIENTATION_NORMAL,
		ExifInterface.ORIENTATION_ROTATE_180,
		ExifInterface.ORIENTATION_ROTATE_270,
		ExifInterface.ORIENTATION_ROTATE_90,
		ExifInterface.ORIENTATION_TRANSPOSE,
		ExifInterface.ORIENTATION_TRANSVERSE,
		ExifInterface.ORIENTATION_UNDEFINED,
		ExifInterface.WHITEBALANCE_AUTO,
		ExifInterface.WHITEBALANCE_MANUAL
		};
	
	public static String [] exifAttributesAPI9 =
		{
		ExifInterface.TAG_DATETIME,
		ExifInterface.TAG_FLASH,
		ExifInterface.TAG_FOCAL_LENGTH,
		ExifInterface.TAG_GPS_ALTITUDE,
		ExifInterface.TAG_GPS_ALTITUDE_REF,
		ExifInterface.TAG_GPS_DATESTAMP,
		ExifInterface.TAG_GPS_LATITUDE,
		ExifInterface.TAG_GPS_LATITUDE_REF,
		ExifInterface.TAG_GPS_LONGITUDE,
		ExifInterface.TAG_GPS_LONGITUDE_REF,
		ExifInterface.TAG_GPS_PROCESSING_METHOD,
		ExifInterface.TAG_GPS_TIMESTAMP,
		ExifInterface.TAG_IMAGE_LENGTH,
		ExifInterface.TAG_IMAGE_WIDTH,
		ExifInterface.TAG_MAKE,
		ExifInterface.TAG_MODEL,
		ExifInterface.TAG_ORIENTATION,
		ExifInterface.TAG_WHITE_BALANCE
		};
	
	public static String [] exifAttributesAPI11 =
		{
		ExifInterface.TAG_APERTURE,
		ExifInterface.TAG_DATETIME,
		ExifInterface.TAG_EXPOSURE_TIME,
		ExifInterface.TAG_FLASH,
		ExifInterface.TAG_FOCAL_LENGTH,
		ExifInterface.TAG_GPS_ALTITUDE,
		ExifInterface.TAG_GPS_ALTITUDE_REF,
		ExifInterface.TAG_GPS_DATESTAMP,
		ExifInterface.TAG_GPS_LATITUDE,
		ExifInterface.TAG_GPS_LATITUDE_REF,
		ExifInterface.TAG_GPS_LONGITUDE,
		ExifInterface.TAG_GPS_LONGITUDE_REF,
		ExifInterface.TAG_GPS_PROCESSING_METHOD,
		ExifInterface.TAG_GPS_TIMESTAMP,
		ExifInterface.TAG_IMAGE_LENGTH,
		ExifInterface.TAG_IMAGE_WIDTH,
		ExifInterface.TAG_ISO,
		ExifInterface.TAG_MAKE,
		ExifInterface.TAG_MODEL,
		ExifInterface.TAG_ORIENTATION,
		ExifInterface.TAG_WHITE_BALANCE
		};
	
	
	
}

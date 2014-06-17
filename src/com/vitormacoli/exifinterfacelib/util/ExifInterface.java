package com.vitormacoli.exifinterfacelib.util;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;


public class ExifInterface {

	private String filePath;
	
	public ExifInterface (String filePath){
		this.filePath = filePath;
	}
	
	public JSONObject getAttributesAsJSON() throws IOException{
		JSONObject json = new JSONObject();
		android.media.ExifInterface exif = new android.media.ExifInterface(filePath);
		int androidVersion = android.os.Build.VERSION.SDK_INT;
		String [] attributes;
		if(androidVersion <= android.os.Build.VERSION_CODES.GINGERBREAD_MR1){
			attributes = ExifUtil.exifAttributesAPI9;
		}else {
			attributes = ExifUtil.exifAttributesAPI11;
		}
		for(int i=0; i<attributes.length; i++){
			try {
				json.put(attributes[i], exif.getAttribute(attributes[i]));
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return json;
	}
	
}

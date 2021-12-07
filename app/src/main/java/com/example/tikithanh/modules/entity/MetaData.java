package com.example.tikithanh.modules.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MetaData {

	@SerializedName("background_image")
	private String backgroundImage;

	@SerializedName("sub_title")
	private String subTitle;

	@SerializedName("more_link")
	private String moreLink;

//	@SerializedName("title_icon")
//	private TitleIcon titleIcon;

	@SerializedName("type")
	private String type;

	@SerializedName("title")
	private String title;

	@SerializedName("more_link_text")
	private String moreLinkText;

	@SerializedName("items")
	private List<Items> items;

	public String getBackgroundImage(){
		return backgroundImage;
	}

	public String getSubTitle(){
		return subTitle;
	}

	public String getMoreLink(){
		return moreLink;
	}

//	public TitleIcon getTitleIcon(){
//		return titleIcon;
//	}

	public String getType(){
		return type;
	}

	public String getTitle(){
		return title;
	}

	public String getMoreLinkText(){
		return moreLinkText;
	}

	public List<Items> getItems(){
		return items;
	}
}
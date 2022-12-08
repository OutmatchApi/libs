/*
 * Slack Web API
 * One way to interact with the Slack platform is its HTTP RPC-based Web API, a collection of methods requiring OAuth 2.0-based user, bot, or workspace tokens blessed with related OAuth scopes.
 *
 * The version of the OpenAPI document: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.outmatchapi.slack;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.outmatchapi.slack.ObjsEnterpriseUser;
import com.outmatchapi.slack.ObjsTeamDiscoverableInner;
import com.outmatchapi.slack.ObjsUserInnerAnyOfTeamProfile;
import com.outmatchapi.slack.ObjsUserProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import invalidPackageName.JSON;

/**
 * enterprise user
 */
@ApiModel(description = "enterprise user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-08T22:09:03.829372Z[Etc/UTC]")
public class ObjsUserInnerAnyOf1 {
  public static final String SERIALIZED_NAME_COLOR = "color";
  @SerializedName(SERIALIZED_NAME_COLOR)
  private String color;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_ENTERPRISE_USER = "enterprise_user";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_USER)
  private ObjsEnterpriseUser enterpriseUser;

  public static final String SERIALIZED_NAME_HAS2FA = "has_2fa";
  @SerializedName(SERIALIZED_NAME_HAS2FA)
  private Boolean has2fa;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IS_ADMIN = "is_admin";
  @SerializedName(SERIALIZED_NAME_IS_ADMIN)
  private Boolean isAdmin;

  public static final String SERIALIZED_NAME_IS_APP_USER = "is_app_user";
  @SerializedName(SERIALIZED_NAME_IS_APP_USER)
  private Boolean isAppUser;

  public static final String SERIALIZED_NAME_IS_BOT = "is_bot";
  @SerializedName(SERIALIZED_NAME_IS_BOT)
  private Boolean isBot;

  public static final String SERIALIZED_NAME_IS_EXTERNAL = "is_external";
  @SerializedName(SERIALIZED_NAME_IS_EXTERNAL)
  private Boolean isExternal;

  public static final String SERIALIZED_NAME_IS_FORGOTTEN = "is_forgotten";
  @SerializedName(SERIALIZED_NAME_IS_FORGOTTEN)
  private Boolean isForgotten;

  public static final String SERIALIZED_NAME_IS_OWNER = "is_owner";
  @SerializedName(SERIALIZED_NAME_IS_OWNER)
  private Boolean isOwner;

  public static final String SERIALIZED_NAME_IS_PRIMARY_OWNER = "is_primary_owner";
  @SerializedName(SERIALIZED_NAME_IS_PRIMARY_OWNER)
  private Boolean isPrimaryOwner;

  public static final String SERIALIZED_NAME_IS_RESTRICTED = "is_restricted";
  @SerializedName(SERIALIZED_NAME_IS_RESTRICTED)
  private Boolean isRestricted;

  public static final String SERIALIZED_NAME_IS_STRANGER = "is_stranger";
  @SerializedName(SERIALIZED_NAME_IS_STRANGER)
  private Boolean isStranger;

  public static final String SERIALIZED_NAME_IS_ULTRA_RESTRICTED = "is_ultra_restricted";
  @SerializedName(SERIALIZED_NAME_IS_ULTRA_RESTRICTED)
  private Boolean isUltraRestricted;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PRESENCE = "presence";
  @SerializedName(SERIALIZED_NAME_PRESENCE)
  private String presence;

  public static final String SERIALIZED_NAME_PROFILE = "profile";
  @SerializedName(SERIALIZED_NAME_PROFILE)
  private ObjsUserProfile profile;

  public static final String SERIALIZED_NAME_REAL_NAME = "real_name";
  @SerializedName(SERIALIZED_NAME_REAL_NAME)
  private String realName;

  public static final String SERIALIZED_NAME_TEAM_ID = "team_id";
  @SerializedName(SERIALIZED_NAME_TEAM_ID)
  private String teamId;

  public static final String SERIALIZED_NAME_TEAM_PROFILE = "team_profile";
  @SerializedName(SERIALIZED_NAME_TEAM_PROFILE)
  private ObjsUserInnerAnyOfTeamProfile teamProfile;

  public static final String SERIALIZED_NAME_TEAMS = "teams";
  @SerializedName(SERIALIZED_NAME_TEAMS)
  private Set<String> teams = null;

  public static final String SERIALIZED_NAME_TWO_FACTOR_TYPE = "two_factor_type";
  @SerializedName(SERIALIZED_NAME_TWO_FACTOR_TYPE)
  private String twoFactorType;

  public static final String SERIALIZED_NAME_TZ = "tz";
  @SerializedName(SERIALIZED_NAME_TZ)
  private List<ObjsTeamDiscoverableInner> tz = null;

  public static final String SERIALIZED_NAME_TZ_LABEL = "tz_label";
  @SerializedName(SERIALIZED_NAME_TZ_LABEL)
  private String tzLabel;

  public static final String SERIALIZED_NAME_TZ_OFFSET = "tz_offset";
  @SerializedName(SERIALIZED_NAME_TZ_OFFSET)
  private BigDecimal tzOffset;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private BigDecimal updated;

  public ObjsUserInnerAnyOf1() {
  }

  public ObjsUserInnerAnyOf1 color(String color) {
    
    this.color = color;
    return this;
  }

   /**
   * refercing to bug: https://jira.tinyspeck.com/browse/EVALUE-1559
   * @return color
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "refercing to bug: https://jira.tinyspeck.com/browse/EVALUE-1559")

  public String getColor() {
    return color;
  }


  public void setColor(String color) {
    this.color = color;
  }


  public ObjsUserInnerAnyOf1 deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public ObjsUserInnerAnyOf1 enterpriseUser(ObjsEnterpriseUser enterpriseUser) {
    
    this.enterpriseUser = enterpriseUser;
    return this;
  }

   /**
   * Get enterpriseUser
   * @return enterpriseUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjsEnterpriseUser getEnterpriseUser() {
    return enterpriseUser;
  }


  public void setEnterpriseUser(ObjsEnterpriseUser enterpriseUser) {
    this.enterpriseUser = enterpriseUser;
  }


  public ObjsUserInnerAnyOf1 has2fa(Boolean has2fa) {
    
    this.has2fa = has2fa;
    return this;
  }

   /**
   * Get has2fa
   * @return has2fa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getHas2fa() {
    return has2fa;
  }


  public void setHas2fa(Boolean has2fa) {
    this.has2fa = has2fa;
  }


  public ObjsUserInnerAnyOf1 id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ObjsUserInnerAnyOf1 isAdmin(Boolean isAdmin) {
    
    this.isAdmin = isAdmin;
    return this;
  }

   /**
   * Get isAdmin
   * @return isAdmin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsAdmin() {
    return isAdmin;
  }


  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
  }


  public ObjsUserInnerAnyOf1 isAppUser(Boolean isAppUser) {
    
    this.isAppUser = isAppUser;
    return this;
  }

   /**
   * Get isAppUser
   * @return isAppUser
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsAppUser() {
    return isAppUser;
  }


  public void setIsAppUser(Boolean isAppUser) {
    this.isAppUser = isAppUser;
  }


  public ObjsUserInnerAnyOf1 isBot(Boolean isBot) {
    
    this.isBot = isBot;
    return this;
  }

   /**
   * Get isBot
   * @return isBot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsBot() {
    return isBot;
  }


  public void setIsBot(Boolean isBot) {
    this.isBot = isBot;
  }


  public ObjsUserInnerAnyOf1 isExternal(Boolean isExternal) {
    
    this.isExternal = isExternal;
    return this;
  }

   /**
   * Get isExternal
   * @return isExternal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsExternal() {
    return isExternal;
  }


  public void setIsExternal(Boolean isExternal) {
    this.isExternal = isExternal;
  }


  public ObjsUserInnerAnyOf1 isForgotten(Boolean isForgotten) {
    
    this.isForgotten = isForgotten;
    return this;
  }

   /**
   * Get isForgotten
   * @return isForgotten
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsForgotten() {
    return isForgotten;
  }


  public void setIsForgotten(Boolean isForgotten) {
    this.isForgotten = isForgotten;
  }


  public ObjsUserInnerAnyOf1 isOwner(Boolean isOwner) {
    
    this.isOwner = isOwner;
    return this;
  }

   /**
   * Get isOwner
   * @return isOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsOwner() {
    return isOwner;
  }


  public void setIsOwner(Boolean isOwner) {
    this.isOwner = isOwner;
  }


  public ObjsUserInnerAnyOf1 isPrimaryOwner(Boolean isPrimaryOwner) {
    
    this.isPrimaryOwner = isPrimaryOwner;
    return this;
  }

   /**
   * Get isPrimaryOwner
   * @return isPrimaryOwner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsPrimaryOwner() {
    return isPrimaryOwner;
  }


  public void setIsPrimaryOwner(Boolean isPrimaryOwner) {
    this.isPrimaryOwner = isPrimaryOwner;
  }


  public ObjsUserInnerAnyOf1 isRestricted(Boolean isRestricted) {
    
    this.isRestricted = isRestricted;
    return this;
  }

   /**
   * Get isRestricted
   * @return isRestricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsRestricted() {
    return isRestricted;
  }


  public void setIsRestricted(Boolean isRestricted) {
    this.isRestricted = isRestricted;
  }


  public ObjsUserInnerAnyOf1 isStranger(Boolean isStranger) {
    
    this.isStranger = isStranger;
    return this;
  }

   /**
   * Get isStranger
   * @return isStranger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsStranger() {
    return isStranger;
  }


  public void setIsStranger(Boolean isStranger) {
    this.isStranger = isStranger;
  }


  public ObjsUserInnerAnyOf1 isUltraRestricted(Boolean isUltraRestricted) {
    
    this.isUltraRestricted = isUltraRestricted;
    return this;
  }

   /**
   * Get isUltraRestricted
   * @return isUltraRestricted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsUltraRestricted() {
    return isUltraRestricted;
  }


  public void setIsUltraRestricted(Boolean isUltraRestricted) {
    this.isUltraRestricted = isUltraRestricted;
  }


  public ObjsUserInnerAnyOf1 locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public ObjsUserInnerAnyOf1 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ObjsUserInnerAnyOf1 presence(String presence) {
    
    this.presence = presence;
    return this;
  }

   /**
   * Get presence
   * @return presence
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPresence() {
    return presence;
  }


  public void setPresence(String presence) {
    this.presence = presence;
  }


  public ObjsUserInnerAnyOf1 profile(ObjsUserProfile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ObjsUserProfile getProfile() {
    return profile;
  }


  public void setProfile(ObjsUserProfile profile) {
    this.profile = profile;
  }


  public ObjsUserInnerAnyOf1 realName(String realName) {
    
    this.realName = realName;
    return this;
  }

   /**
   * Get realName
   * @return realName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRealName() {
    return realName;
  }


  public void setRealName(String realName) {
    this.realName = realName;
  }


  public ObjsUserInnerAnyOf1 teamId(String teamId) {
    
    this.teamId = teamId;
    return this;
  }

   /**
   * Get teamId
   * @return teamId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTeamId() {
    return teamId;
  }


  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  public ObjsUserInnerAnyOf1 teamProfile(ObjsUserInnerAnyOfTeamProfile teamProfile) {
    
    this.teamProfile = teamProfile;
    return this;
  }

   /**
   * Get teamProfile
   * @return teamProfile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ObjsUserInnerAnyOfTeamProfile getTeamProfile() {
    return teamProfile;
  }


  public void setTeamProfile(ObjsUserInnerAnyOfTeamProfile teamProfile) {
    this.teamProfile = teamProfile;
  }


  public ObjsUserInnerAnyOf1 teams(Set<String> teams) {
    
    this.teams = teams;
    return this;
  }

  public ObjsUserInnerAnyOf1 addTeamsItem(String teamsItem) {
    if (this.teams == null) {
      this.teams = new LinkedHashSet<>();
    }
    this.teams.add(teamsItem);
    return this;
  }

   /**
   * Get teams
   * @return teams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Set<String> getTeams() {
    return teams;
  }


  public void setTeams(Set<String> teams) {
    this.teams = teams;
  }


  public ObjsUserInnerAnyOf1 twoFactorType(String twoFactorType) {
    
    this.twoFactorType = twoFactorType;
    return this;
  }

   /**
   * Get twoFactorType
   * @return twoFactorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTwoFactorType() {
    return twoFactorType;
  }


  public void setTwoFactorType(String twoFactorType) {
    this.twoFactorType = twoFactorType;
  }


  public ObjsUserInnerAnyOf1 tz(List<ObjsTeamDiscoverableInner> tz) {
    
    this.tz = tz;
    return this;
  }

  public ObjsUserInnerAnyOf1 addTzItem(ObjsTeamDiscoverableInner tzItem) {
    if (this.tz == null) {
      this.tz = new ArrayList<>();
    }
    this.tz.add(tzItem);
    return this;
  }

   /**
   * Get tz
   * @return tz
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ObjsTeamDiscoverableInner> getTz() {
    return tz;
  }


  public void setTz(List<ObjsTeamDiscoverableInner> tz) {
    this.tz = tz;
  }


  public ObjsUserInnerAnyOf1 tzLabel(String tzLabel) {
    
    this.tzLabel = tzLabel;
    return this;
  }

   /**
   * Get tzLabel
   * @return tzLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTzLabel() {
    return tzLabel;
  }


  public void setTzLabel(String tzLabel) {
    this.tzLabel = tzLabel;
  }


  public ObjsUserInnerAnyOf1 tzOffset(BigDecimal tzOffset) {
    
    this.tzOffset = tzOffset;
    return this;
  }

   /**
   * Get tzOffset
   * @return tzOffset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getTzOffset() {
    return tzOffset;
  }


  public void setTzOffset(BigDecimal tzOffset) {
    this.tzOffset = tzOffset;
  }


  public ObjsUserInnerAnyOf1 updated(BigDecimal updated) {
    
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public BigDecimal getUpdated() {
    return updated;
  }


  public void setUpdated(BigDecimal updated) {
    this.updated = updated;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjsUserInnerAnyOf1 objsUserInnerAnyOf1 = (ObjsUserInnerAnyOf1) o;
    return Objects.equals(this.color, objsUserInnerAnyOf1.color) &&
        Objects.equals(this.deleted, objsUserInnerAnyOf1.deleted) &&
        Objects.equals(this.enterpriseUser, objsUserInnerAnyOf1.enterpriseUser) &&
        Objects.equals(this.has2fa, objsUserInnerAnyOf1.has2fa) &&
        Objects.equals(this.id, objsUserInnerAnyOf1.id) &&
        Objects.equals(this.isAdmin, objsUserInnerAnyOf1.isAdmin) &&
        Objects.equals(this.isAppUser, objsUserInnerAnyOf1.isAppUser) &&
        Objects.equals(this.isBot, objsUserInnerAnyOf1.isBot) &&
        Objects.equals(this.isExternal, objsUserInnerAnyOf1.isExternal) &&
        Objects.equals(this.isForgotten, objsUserInnerAnyOf1.isForgotten) &&
        Objects.equals(this.isOwner, objsUserInnerAnyOf1.isOwner) &&
        Objects.equals(this.isPrimaryOwner, objsUserInnerAnyOf1.isPrimaryOwner) &&
        Objects.equals(this.isRestricted, objsUserInnerAnyOf1.isRestricted) &&
        Objects.equals(this.isStranger, objsUserInnerAnyOf1.isStranger) &&
        Objects.equals(this.isUltraRestricted, objsUserInnerAnyOf1.isUltraRestricted) &&
        Objects.equals(this.locale, objsUserInnerAnyOf1.locale) &&
        Objects.equals(this.name, objsUserInnerAnyOf1.name) &&
        Objects.equals(this.presence, objsUserInnerAnyOf1.presence) &&
        Objects.equals(this.profile, objsUserInnerAnyOf1.profile) &&
        Objects.equals(this.realName, objsUserInnerAnyOf1.realName) &&
        Objects.equals(this.teamId, objsUserInnerAnyOf1.teamId) &&
        Objects.equals(this.teamProfile, objsUserInnerAnyOf1.teamProfile) &&
        Objects.equals(this.teams, objsUserInnerAnyOf1.teams) &&
        Objects.equals(this.twoFactorType, objsUserInnerAnyOf1.twoFactorType) &&
        Objects.equals(this.tz, objsUserInnerAnyOf1.tz) &&
        Objects.equals(this.tzLabel, objsUserInnerAnyOf1.tzLabel) &&
        Objects.equals(this.tzOffset, objsUserInnerAnyOf1.tzOffset) &&
        Objects.equals(this.updated, objsUserInnerAnyOf1.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(color, deleted, enterpriseUser, has2fa, id, isAdmin, isAppUser, isBot, isExternal, isForgotten, isOwner, isPrimaryOwner, isRestricted, isStranger, isUltraRestricted, locale, name, presence, profile, realName, teamId, teamProfile, teams, twoFactorType, tz, tzLabel, tzOffset, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjsUserInnerAnyOf1 {\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    enterpriseUser: ").append(toIndentedString(enterpriseUser)).append("\n");
    sb.append("    has2fa: ").append(toIndentedString(has2fa)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAdmin: ").append(toIndentedString(isAdmin)).append("\n");
    sb.append("    isAppUser: ").append(toIndentedString(isAppUser)).append("\n");
    sb.append("    isBot: ").append(toIndentedString(isBot)).append("\n");
    sb.append("    isExternal: ").append(toIndentedString(isExternal)).append("\n");
    sb.append("    isForgotten: ").append(toIndentedString(isForgotten)).append("\n");
    sb.append("    isOwner: ").append(toIndentedString(isOwner)).append("\n");
    sb.append("    isPrimaryOwner: ").append(toIndentedString(isPrimaryOwner)).append("\n");
    sb.append("    isRestricted: ").append(toIndentedString(isRestricted)).append("\n");
    sb.append("    isStranger: ").append(toIndentedString(isStranger)).append("\n");
    sb.append("    isUltraRestricted: ").append(toIndentedString(isUltraRestricted)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    presence: ").append(toIndentedString(presence)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    realName: ").append(toIndentedString(realName)).append("\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamProfile: ").append(toIndentedString(teamProfile)).append("\n");
    sb.append("    teams: ").append(toIndentedString(teams)).append("\n");
    sb.append("    twoFactorType: ").append(toIndentedString(twoFactorType)).append("\n");
    sb.append("    tz: ").append(toIndentedString(tz)).append("\n");
    sb.append("    tzLabel: ").append(toIndentedString(tzLabel)).append("\n");
    sb.append("    tzOffset: ").append(toIndentedString(tzOffset)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("color");
    openapiFields.add("deleted");
    openapiFields.add("enterprise_user");
    openapiFields.add("has_2fa");
    openapiFields.add("id");
    openapiFields.add("is_admin");
    openapiFields.add("is_app_user");
    openapiFields.add("is_bot");
    openapiFields.add("is_external");
    openapiFields.add("is_forgotten");
    openapiFields.add("is_owner");
    openapiFields.add("is_primary_owner");
    openapiFields.add("is_restricted");
    openapiFields.add("is_stranger");
    openapiFields.add("is_ultra_restricted");
    openapiFields.add("locale");
    openapiFields.add("name");
    openapiFields.add("presence");
    openapiFields.add("profile");
    openapiFields.add("real_name");
    openapiFields.add("team_id");
    openapiFields.add("team_profile");
    openapiFields.add("teams");
    openapiFields.add("two_factor_type");
    openapiFields.add("tz");
    openapiFields.add("tz_label");
    openapiFields.add("tz_offset");
    openapiFields.add("updated");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("is_app_user");
    openapiRequiredFields.add("is_bot");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("profile");
    openapiRequiredFields.add("updated");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ObjsUserInnerAnyOf1
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ObjsUserInnerAnyOf1.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ObjsUserInnerAnyOf1 is not found in the empty JSON string", ObjsUserInnerAnyOf1.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ObjsUserInnerAnyOf1.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ObjsUserInnerAnyOf1` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ObjsUserInnerAnyOf1.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if ((jsonObj.get("color") != null && !jsonObj.get("color").isJsonNull()) && !jsonObj.get("color").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `color` to be a primitive type in the JSON string but got `%s`", jsonObj.get("color").toString()));
      }
      // validate the optional field `enterprise_user`
      if (jsonObj.get("enterprise_user") != null && !jsonObj.get("enterprise_user").isJsonNull()) {
        ObjsEnterpriseUser.validateJsonObject(jsonObj.getAsJsonObject("enterprise_user"));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("locale") != null && !jsonObj.get("locale").isJsonNull()) && !jsonObj.get("locale").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `locale` to be a primitive type in the JSON string but got `%s`", jsonObj.get("locale").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("presence") != null && !jsonObj.get("presence").isJsonNull()) && !jsonObj.get("presence").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `presence` to be a primitive type in the JSON string but got `%s`", jsonObj.get("presence").toString()));
      }
      // validate the required field `profile`
      ObjsUserProfile.validateJsonObject(jsonObj.getAsJsonObject("profile"));
      if ((jsonObj.get("real_name") != null && !jsonObj.get("real_name").isJsonNull()) && !jsonObj.get("real_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_name").toString()));
      }
      if ((jsonObj.get("team_id") != null && !jsonObj.get("team_id").isJsonNull()) && !jsonObj.get("team_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `team_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("team_id").toString()));
      }
      // validate the optional field `team_profile`
      if (jsonObj.get("team_profile") != null && !jsonObj.get("team_profile").isJsonNull()) {
        ObjsUserInnerAnyOfTeamProfile.validateJsonObject(jsonObj.getAsJsonObject("team_profile"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("teams") != null && !jsonObj.get("teams").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `teams` to be an array in the JSON string but got `%s`", jsonObj.get("teams").toString()));
      }
      if ((jsonObj.get("two_factor_type") != null && !jsonObj.get("two_factor_type").isJsonNull()) && !jsonObj.get("two_factor_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `two_factor_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("two_factor_type").toString()));
      }
      if (jsonObj.get("tz") != null && !jsonObj.get("tz").isJsonNull()) {
        JsonArray jsonArraytz = jsonObj.getAsJsonArray("tz");
        if (jsonArraytz != null) {
          // ensure the json data is an array
          if (!jsonObj.get("tz").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `tz` to be an array in the JSON string but got `%s`", jsonObj.get("tz").toString()));
          }

          // validate the optional field `tz` (array)
          for (int i = 0; i < jsonArraytz.size(); i++) {
            ObjsTeamDiscoverableInner.validateJsonObject(jsonArraytz.get(i).getAsJsonObject());
          };
        }
      }
      if ((jsonObj.get("tz_label") != null && !jsonObj.get("tz_label").isJsonNull()) && !jsonObj.get("tz_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tz_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tz_label").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ObjsUserInnerAnyOf1.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ObjsUserInnerAnyOf1' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ObjsUserInnerAnyOf1> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ObjsUserInnerAnyOf1.class));

       return (TypeAdapter<T>) new TypeAdapter<ObjsUserInnerAnyOf1>() {
           @Override
           public void write(JsonWriter out, ObjsUserInnerAnyOf1 value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ObjsUserInnerAnyOf1 read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ObjsUserInnerAnyOf1 given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ObjsUserInnerAnyOf1
  * @throws IOException if the JSON string is invalid with respect to ObjsUserInnerAnyOf1
  */
  public static ObjsUserInnerAnyOf1 fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ObjsUserInnerAnyOf1.class);
  }

 /**
  * Convert an instance of ObjsUserInnerAnyOf1 to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


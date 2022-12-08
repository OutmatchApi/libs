/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package com.outmatchapi.slack

import com.outmatchapi.slack.BlocksInner
import com.outmatchapi.slack.ObjsBotProfile
import com.outmatchapi.slack.ObjsComment
import com.outmatchapi.slack.ObjsFile
import com.outmatchapi.slack.ObjsMessageAttachmentsInner
import com.outmatchapi.slack.ObjsMessageBotIdInner
import com.outmatchapi.slack.ObjsMessageIcons
import com.outmatchapi.slack.ObjsReaction
import com.outmatchapi.slack.ObjsUserProfileShort

import com.squareup.moshi.Json

/**
 * 
 *
 * @param text 
 * @param ts 
 * @param type 
 * @param attachments 
 * @param blocks This is a very loose definition, in the future, we'll populate this with deeper schema in this definition namespace.
 * @param botId 
 * @param botProfile 
 * @param clientMsgId 
 * @param comment 
 * @param displayAsBot 
 * @param file 
 * @param files 
 * @param icons 
 * @param inviter 
 * @param isDelayedMessage 
 * @param isIntro 
 * @param isStarred 
 * @param lastRead 
 * @param latestReply 
 * @param name 
 * @param oldName 
 * @param parentUserId 
 * @param permalink 
 * @param pinnedTo 
 * @param purpose 
 * @param reactions 
 * @param replyCount 
 * @param replyUsers 
 * @param replyUsersCount 
 * @param sourceTeam 
 * @param subscribed 
 * @param subtype 
 * @param team 
 * @param threadTs 
 * @param topic 
 * @param unreadCount 
 * @param upload 
 * @param user 
 * @param userProfile 
 * @param userTeam 
 * @param username 
 */


data class ObjsMessage (

    @Json(name = "text")
    val text: kotlin.String,

    @Json(name = "ts")
    val ts: kotlin.String,

    @Json(name = "type")
    val type: kotlin.String,

    @Json(name = "attachments")
    val attachments: kotlin.collections.Set<ObjsMessageAttachmentsInner>? = null,

    /* This is a very loose definition, in the future, we'll populate this with deeper schema in this definition namespace. */
    @Json(name = "blocks")
    val blocks: kotlin.collections.List<BlocksInner>? = null,

    @Json(name = "bot_id")
    val botId: kotlin.collections.List<ObjsMessageBotIdInner>? = null,

    @Json(name = "bot_profile")
    val botProfile: ObjsBotProfile? = null,

    @Json(name = "client_msg_id")
    val clientMsgId: kotlin.String? = null,

    @Json(name = "comment")
    val comment: ObjsComment? = null,

    @Json(name = "display_as_bot")
    val displayAsBot: kotlin.Boolean? = null,

    @Json(name = "file")
    val file: ObjsFile? = null,

    @Json(name = "files")
    val files: kotlin.collections.Set<ObjsFile>? = null,

    @Json(name = "icons")
    val icons: ObjsMessageIcons? = null,

    @Json(name = "inviter")
    val inviter: kotlin.String? = null,

    @Json(name = "is_delayed_message")
    val isDelayedMessage: kotlin.Boolean? = null,

    @Json(name = "is_intro")
    val isIntro: kotlin.Boolean? = null,

    @Json(name = "is_starred")
    val isStarred: kotlin.Boolean? = null,

    @Json(name = "last_read")
    val lastRead: kotlin.String? = null,

    @Json(name = "latest_reply")
    val latestReply: kotlin.String? = null,

    @Json(name = "name")
    val name: kotlin.String? = null,

    @Json(name = "old_name")
    val oldName: kotlin.String? = null,

    @Json(name = "parent_user_id")
    val parentUserId: kotlin.String? = null,

    @Json(name = "permalink")
    val permalink: java.net.URI? = null,

    @Json(name = "pinned_to")
    val pinnedTo: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "purpose")
    val purpose: kotlin.String? = null,

    @Json(name = "reactions")
    val reactions: kotlin.collections.List<ObjsReaction>? = null,

    @Json(name = "reply_count")
    val replyCount: kotlin.Int? = null,

    @Json(name = "reply_users")
    val replyUsers: kotlin.collections.Set<kotlin.String>? = null,

    @Json(name = "reply_users_count")
    val replyUsersCount: kotlin.Int? = null,

    @Json(name = "source_team")
    val sourceTeam: kotlin.String? = null,

    @Json(name = "subscribed")
    val subscribed: kotlin.Boolean? = null,

    @Json(name = "subtype")
    val subtype: kotlin.String? = null,

    @Json(name = "team")
    val team: kotlin.String? = null,

    @Json(name = "thread_ts")
    val threadTs: kotlin.String? = null,

    @Json(name = "topic")
    val topic: kotlin.String? = null,

    @Json(name = "unread_count")
    val unreadCount: kotlin.Int? = null,

    @Json(name = "upload")
    val upload: kotlin.Boolean? = null,

    @Json(name = "user")
    val user: kotlin.String? = null,

    @Json(name = "user_profile")
    val userProfile: ObjsUserProfileShort? = null,

    @Json(name = "user_team")
    val userTeam: kotlin.String? = null,

    @Json(name = "username")
    val username: kotlin.String? = null

)


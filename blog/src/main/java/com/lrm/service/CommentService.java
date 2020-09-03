package com.lrm.service;

import com.lrm.po.Comment;

import java.util.List;

/**
 * Created by lm on 2020/10/22.
 */
public interface CommentService {

    List<Comment> listCommentByBlogId(Long blogId);

    Comment saveComment(Comment comment);
}

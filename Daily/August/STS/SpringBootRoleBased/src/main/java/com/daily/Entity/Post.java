/*August 10, 2022*/

package com.daily.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "POSTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post
{
	@Id
	@GeneratedValue
	private int postId;
	private String subject;
	private String description;
	private String userName;
	@Enumerated(EnumType.STRING)
	private PostStatus status;
}
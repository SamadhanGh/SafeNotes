package com.safe.SafeNotes.models;
import lombok.Data;
import jakarta.persistence.*;

/**
 * Note class represents a note entity in the database.
 * It has an id, content, and ownerUsername.
 */
@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String content;

    private String ownerUsername;
}


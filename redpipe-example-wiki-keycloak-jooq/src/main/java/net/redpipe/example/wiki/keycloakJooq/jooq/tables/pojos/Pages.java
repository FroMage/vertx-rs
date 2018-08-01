/*
 * This file is generated by jOOQ.
 */
package net.redpipe.example.wiki.keycloakJooq.jooq.tables.pojos;


import io.github.jklingsporn.vertx.jooq.shared.internal.VertxPojo;

import javax.annotation.Generated;

import net.redpipe.example.wiki.keycloakJooq.jooq.tables.interfaces.IPages;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Pages implements VertxPojo, IPages {

    private static final long serialVersionUID = -217082024;

    private Integer id;
    private String  name;
    private String  content;

    public Pages() {}

    public Pages(IPages value) {
        this.id = value.getId();
        this.name = value.getName();
        this.content = value.getContent();
    }

    public Pages(
        Integer id,
        String  name,
        String  content
    ) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    @Override
    public Integer getId() {
        return this.id;
    }

    @Override
    public Pages setId(Integer id) {
        this.id = id;
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Pages setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String getContent() {
        return this.content;
    }

    @Override
    public Pages setContent(String content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pages (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(content);

        sb.append(")");
        return sb.toString();
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(IPages from) {
        setId(from.getId());
        setName(from.getName());
        setContent(from.getContent());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends IPages> E into(E into) {
        into.from(this);
        return into;
    }

    public Pages(io.vertx.core.json.JsonObject json) {
        this();
        fromJson(json);
    }
}

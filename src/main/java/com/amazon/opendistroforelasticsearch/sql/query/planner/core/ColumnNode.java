/*
 *   Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License").
 *   You may not use this file except in compliance with the License.
 *   A copy of the License is located at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file. This file is distributed
 *   on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 *   express or implied. See the License for the specific language governing
 *   permissions and limitations under the License.
 */

package com.amazon.opendistroforelasticsearch.sql.query.planner.core;

import com.amazon.opendistroforelasticsearch.sql.executor.format.Schema;
import com.amazon.opendistroforelasticsearch.sql.expression.core.Expression;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * The definition of column node.
 */
@Builder
@Setter
@Getter
@ToString
public class ColumnNode {
    private String name;
    private String alias;
    private Schema.Type type;
    private Expression expr;
}
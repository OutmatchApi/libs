# coding: utf-8

"""
    Outmatch API

    Outmatch API  # noqa: E501

    The version of the OpenAPI document: 0.0.44
    Contact: internal@outmatchapi.com
    Generated by: https://openapi-generator.tech
"""

from setuptools import setup, find_packages  # noqa: H301

NAME = "api"
VERSION = "0.0.44"
# To install the library, run the following
#
# python setup.py install
#
# prerequisite: setuptools
# http://pypi.python.org/pypi/setuptools

REQUIRES = [
    "certifi >= 14.5.14",
    "frozendict ~= 2.3.4",
    "python-dateutil ~= 2.7.0",
    "setuptools >= 21.0.0",
    "typing_extensions ~= 4.3.0",
    "urllib3 ~= 1.26.7",
]

setup(
    name=NAME,
    version=VERSION,
    description="Outmatch API",
    author="internal@outmatchapi.com",
    author_email="internal@outmatchapi.com",
    url="",
    keywords=["OpenAPI", "OpenAPI-Generator", "Outmatch API"],
    python_requires=">=3.7",
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    license="MIT",
    long_description="""\
    Outmatch API  # noqa: E501
    """
)

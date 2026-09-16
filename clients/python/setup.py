from setuptools import setup, find_packages  # noqa: H301

NAME = "fever-client"
VERSION = "0.3.2"
PYTHON_REQUIRES = ">= 3.10"
REQUIRES = [
    "python-dateutil >= 2.8.2",
    "aiohttp >= 3.14.1",
    "aiohttp-retry >= 2.8.3",
    "pydantic >= 2.11",
    "typing-extensions >= 4.7.1",
]

setup(
    name=NAME,
    version=VERSION,
    description="FEVER Retrieval",
    author="OpenAPI Generator community",
    author_email="team@openapitools.org",
    url="https://github.com/Lowdown-Labs/fever-clients",
    keywords=["OpenAPI", "OpenAPI-Generator", "FEVER Retrieval"],
    install_requires=REQUIRES,
    packages=find_packages(exclude=["test", "tests"]),
    include_package_data=True,
    long_description_content_type='text/markdown',
    long_description="""\
    The multimodal media database. Images, video, and audio in one table: hybrid vector + full-text search, dedupe, seek-to-moment video hits, whisper transcript spans. Tenancy, scale, and isolation are automatic; the tenant is taken from the API key.
    """,  # noqa: E501
    package_data={"fever_client": ["py.typed"]},
)
